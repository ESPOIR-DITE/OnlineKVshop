package com.etoiledespoir.onlinekvshop.repository.picture3.impl;

import com.etoiledespoir.onlinekvshop.domain.Pictures2;
import com.etoiledespoir.onlinekvshop.factory.domain.Picture2Factory;
import com.etoiledespoir.onlinekvshop.repository.picture3.PictureForWebInt;
import org.apache.commons.io.FileUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Component;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;



@Component
public class PictureForWeb implements PictureForWebInt {
    private String url="jdbc:mysql://localhost:3306/okvs?autoReconnect=true&useSSL=false";
    private String user="root";
    private String password="";
    private Connection conne;

    Image Image=null;

    private static PictureForWeb pictureRep=null;
    private PictureForWeb(){
        try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static PictureForWeb getPictureRep(){
        if(pictureRep==null){
            pictureRep =new PictureForWeb();
        }return pictureRep;
    }
    @Override
    public Pictures2 creat(Pictures2 picture) {
        String code=getPremier();
        try {
            String sql="INSERT INTO PICTURE( PICTURE_ID , PICTURE_NAME , PICTURE_URL , PICTURE_DESCRIPTION  ) VALUES ("+code+",'"+picture.getName()+"',' on computor','"+picture.getDesciption()+"');";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        writePicture(picture.getImage(),code);
        return null;
    }

    @Override
    public Pictures2 delete(String id) {
        Pictures2 pictures2=read(id);
        // pictures2=new Picture2Factory.getPictureForRead(read(id).getId(),read(id).getName(),read(id).getUrl(),read(id).getDesciption());
        try{
            String sql="DELETE FROM PICTURE where PICTURE_ID="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        deleteFromFile(id);
        return pictures2 ;
    }

    @Override
    public Pictures2 Update(Pictures2 picture) {
        return null;
    }

    public Image getImage(){
        return Image;
    }
    @Override
    public Pictures2 read(String id) {
        Pictures2 pictures2=null;
        Pictures2 picture=null;
        BufferedImage bi=null;
        try{
            String sql="SELECT * FROM PICTURE where PICTURE_ID="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs= statement.executeQuery();
            while (rs.next())
            {
                pictures2= Picture2Factory.getPictureForRep(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();}

        picture=Picture2Factory.getPictureForWeb(pictures2.getId(),pictures2.getName(),pictures2.getUrl(),pictures2.getDesciption(),readFile(pictures2.getId()));
        System.out.println(picture.toString());
        return picture;
    }

    @Override
    public ArrayList<String> readAll() {
        return null;
    }
    public ArrayList<Pictures2> getAll(){
        ArrayList<Pictures2>myList=new ArrayList<>();

        Pictures2 picture=null;
        try{
            String sql="SELECT * FROM payment;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs= statement.executeQuery();
            while (rs.next())
            {
                String id=rs.getString(1);
                picture=Picture2Factory.getPictureForWeb(id,rs.getString(2),rs.getString(3),rs.getString(4),readFile(id));

                myList.add(picture);
                // System.out.println(admin.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return myList;
    }

    @Override
    public String getPremier() {
        String highValeu="";
        try {
            String sql="select MAX(PICTURE_ID) from PICTURE ;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
                highValeu=rs.getString(1);
                int x=Integer.parseInt(highValeu)+1;
                highValeu=""+x;
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }catch (NullPointerException e )
        {
            highValeu="1000";
        }catch (NumberFormatException x){ highValeu="1000";}

        if(highValeu==null){highValeu="1000";}
        //System.out.println(highValeu);

        return highValeu;
    }
    public void writePicture(Image image,String id){
        // System.out.println(id+"  the id");

        File outputfile = new File("C:\\Users\\ESPOIR\\IntelliJIDEAProjects\\onlinekvshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\MYPICTURES\\"+id+".png");
        try {
            ImageIO.write((RenderedImage) image,"png",outputfile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String readFile(String id){
        BufferedImage bufferedImage=null;
        String imageDataString=null;
        File myfile=new File("C:\\Users\\ESPOIR\\IntelliJIDEAProjects\\onlinekvshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\MYPICTURES\\"+id+".png");
        try {
            //bufferedImage= ImageIO.read(myfile);
            byte[] fileContent= FileUtils.readFileToByteArray(myfile);

           /** FileInputStream imageInFile = new FileInputStream(myfile);
            byte imageData[] = new byte[(int) myfile.length()];
            imageInFile.read(imageData);*/
            imageDataString = encodeImage(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageDataString;
    }
    public void deleteFromFile(String id){
        File myfile=new File("C:\\Users\\ESPOIR\\IntelliJIDEAProjects\\onlinekvshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\MYPICTURES\\"+id+".png");
        myfile.delete();
    }
    public static String encodeImage(byte[] imageByteArray) {
        String string= java.util.Base64.getEncoder().encodeToString(imageByteArray);
        return string;
    }

}

