package com.etoiledespoir.onlinekvshop.service.pictures;

import com.etoiledespoir.onlinekvshop.domain.pictures.Images;
import com.etoiledespoir.onlinekvshop.repository.pictures.ImagesRepository;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

/**
 * this class will be helping the creation of the images of each item thet we will be adding to database
 * each item may have one or many pictures.
 */

@Service
public class ImagesService implements Iservice<Images,String> {
    private static ImagesService imagesService;
    @Autowired
    private ImagesRepository ir;

    /***
     * File location;
     */
    private String fileName = Paths.get("").toAbsolutePath().toString()+"output.jpg";
    private File file_save_path = new File(fileName);

    private String fileName1 = Paths.get("").toAbsolutePath().toString()+"resized.jpg";
    private File file_read_path = new File(fileName1);

    private ImagesService() {
    }
    public static ImagesService getImagesService(){
        if(imagesService==null){
             imagesService=new ImagesService();
        }return imagesService;
    }

    @Override
    public Images creat(Images images) {
        return ir.save(images);
    }

    @Override
    public Images delete(String id) {
        Optional<Images> result=ir.findById(id);
        ir.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public Images Update(Images images) {
        return ir.save(images);
    }

    @Override
    public Images read(String id) {
        Optional<Images> result=ir.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Images> readAll() {
        return ir.findAll();
    }
    public List<Images> readFiles(String imageId){
        List<Images>reserve=new ArrayList<>();
        List<Images>images=ir.findAll();
        for (Images images1: images){
            if(images1.getId().equals(imageId)){
                reserve.add(images1);
            }
        }
        return reserve;
    }
    /****
     * This method first converts byte array to a file
     * and write it in util directory
     * naming it output.jpg
     * so that the method that resize picture can read it from that location.
     * @param bytes
     * @throws IOException
     */
    public void pictureWriter(byte[] bytes) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        BufferedImage bImage2 = ImageIO.read(bis);
        ImageIO.write(bImage2, "jpg", file_save_path);
        System.out.println("image created");
    }
    public byte[] convertToBytes() throws IOException {
        FileInputStream fis = new FileInputStream(file_read_path);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        try {
            for (int readNum; (readNum = fis.read(buf)) != -1; ) {
                bos.write(buf, 0, readNum); //no doubt here is 0
            }
        } catch (IOException ex) {
            System.out.println("failed to convert to byte array");
        }
        bos.close();
        fis.close();
        return bos.toByteArray();
    }

    public byte[] encodeIntoByteArray(byte[] image) {
        String encodedString = Base64.getEncoder().encodeToString(image);
        byte[] byteArrray = encodedString.getBytes();
        return byteArrray;
    }
    public String decodeIntoString(byte[] picture) {
        byte[] byteArrayPicture = Base64.getDecoder().decode(picture);
        String stringPicture = Base64.getEncoder().encodeToString(byteArrayPicture);
        return stringPicture;
    }
}
