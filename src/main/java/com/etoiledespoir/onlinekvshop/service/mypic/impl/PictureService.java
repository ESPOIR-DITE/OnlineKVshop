package com.etoiledespoir.onlinekvshop.service.mypic.impl;

import com.etoiledespoir.onlinekvshop.domain.pic.Mypic;
import com.etoiledespoir.onlinekvshop.domain.users.Demography.Gender;
import com.etoiledespoir.onlinekvshop.repository.pic.MypicInt;
import com.etoiledespoir.onlinekvshop.service.mypic.PictureServiceInt;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PictureService implements PictureServiceInt {
    private static PictureService pictureService;
    @Autowired
    MypicInt mypicInt;

    private BufferedImage bufferedImage;

    private PictureService() {
    }

    public static PictureService getPictureService() {
        if(pictureService==null){
            pictureService=new PictureService();
        }
        return pictureService;
    }




    @Override
    public Mypic creat(Mypic mypic) {
        System.out.println(mypic.toString());
        return mypicInt.save(mypic);
    }


    public String creatImage(File file,String id){
        try {
            bufferedImage= ImageIO.read(file);
            Image myimage=resize(bufferedImage,500,500);
            writePicture(myimage,id);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readFile(id);
    }

    @Override
    public Mypic delete(String id) {
        Optional<Mypic> pic=mypicInt.findById(id);
        if(pic!=null){
            mypicInt.deleteById(id);
        }
        return pic.orElse(null);
    }

    @Override
    public Mypic Update(Mypic mypic) {
        return mypicInt.save(mypic);
    }

    @Override
    public Mypic read(String id) {
        Optional<Mypic> pic=mypicInt.findById(id);
        return pic.orElse(null);
    }
    public String readImage(String id){
        return readFile(id);
    }

    public Mypic findPictureByItemId(String itemId){
        List<Mypic>pic=mypicInt.findAll();
        for (Mypic mypic : pic) {
            if (mypic.getItemId().equalsIgnoreCase(itemId)) return mypic;
        }return null;
    }

    @Override
    public List<Mypic> readAll() {
        return mypicInt.findAll();
    }

    public List<String> readAllImage() throws IOException {
        List<String> result=new ArrayList<>();
        List<String> result2=new ArrayList<>();
        String imageString=null;
        /**
         * here we are reading everything in the provisiore dericetoty
         */
        try (Stream<Path> walk = Files.walk(Paths.get("C:\\Users\\Nicole Abrahams\\Desktop\\ACTUAL_WORK\\ADP_PROJECT\\OnlineKVshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\provisiore"))) {

            result = walk.filter(Files::isRegularFile)
                    .map(x -> x.toString()).collect(Collectors.toList());

            result.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
        for(String myimage:result){
            File file =new File(myimage);
            imageString=encoder(file);
            result2.add(imageString);
        }
        return result2;
    }

    /**
     * this me thode read all the files in the directory and return an arrayList of Base64
     * @return
     * @throws IOException

    public List<String> readAllImage() throws IOException {
        List<String>stringPictureList=new ArrayList<>();
       //List<File> filesInFolder = Files.walk(Paths.get("C:\\Users\\ESPOIR\\IntelliJIDEAProjects\\onlinekvshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\MYPICTURES\\"))
        List<File> filesInFolder = Files.walk(Paths.get("        C:\\Users\\Nicole Abrahams\\Desktop\\ACTUAL_WORK\\ADP_PROJECT\\OnlineKVshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\provisiore\\"))

                .filter(Files::isRegularFile)
                .map(Path::toFile)
                .collect(Collectors.toList());
        for(File file:filesInFolder){
            stringPictureList.add(encoder(file));
        }
        return stringPictureList;
    }*/

    public void writePicture(Image image, String id){
        // System.out.println(id+"  the id");

       // File outputfile = new File("C:\\Users\\ESPOIR\\IntelliJIDEAProjects\\onlinekvshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\MYPICTURES\\"+id+".png");
        File outputfile = new File("C:\\Users\\Nicole Abrahams\\Desktop\\ACTUAL_WORK\\ADP_PROJECT\\OnlineKVshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\provisiore\\"+id+".png");
        try {
            ImageIO.write((RenderedImage) image,"png",outputfile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readPicturePath(String id){
       // return "C:\\Users\\ESPOIR\\IntelliJIDEAProjects\\onlinekvshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\MYPICTURES\\"+id+".png";
        return "C:\\Users\\Nicole Abrahams\\Desktop\\ACTUAL_WORK\\ADP_PROJECT\\OnlineKVshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\provisiore\\"+id+".png";
    }

    public String readFile(String id){
        BufferedImage bufferedImage=null;
        String encodedString=null;
        //File myfile=new File("C:\\Users\\ESPOIR\\IntelliJIDEAProjects\\onlinekvshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\MYPICTURES\\"+id+".png");
        File myfile = new File("C:\\Users\\Nicole Abrahams\\Desktop\\ACTUAL_WORK\\ADP_PROJECT\\OnlineKVshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\provisiore\\"+id+".png");

        try {
            byte[] fileContent = FileUtils.readFileToByteArray(myfile);
            //bufferedImage=ImageIO.read(myfile);
             encodedString = Base64.getEncoder().encodeToString(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return encodedString;
    }

    public String encoder(File file){
        String encodedString=null;
        try {
            byte[] fileContent = FileUtils.readFileToByteArray(file);
            //bufferedImage=ImageIO.read(myfile);
            encodedString = Base64.getEncoder().encodeToString(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return encodedString;
    }


    public void deleteFromFile(String id){
        File myfile=new File("C:\\Users\\ESPOIR\\IntelliJIDEAProjects\\onlinekvshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\MYPICTURES\\"+id+".png");
        myfile.delete();
    }
    private static BufferedImage resize(BufferedImage img, int height, int width) {
        // System.out.println(img+"   in resize");
        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }
}
