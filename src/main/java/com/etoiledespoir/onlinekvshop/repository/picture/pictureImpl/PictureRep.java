package com.etoiledespoir.onlinekvshop.repository.picture.pictureImpl;

import com.etoiledespoir.onlinekvshop.domain.Picture;
import com.etoiledespoir.onlinekvshop.factory.domain.PictureFactory;
import com.etoiledespoir.onlinekvshop.repository.picture.PictureRepoInt;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.sql.*;
import java.util.ArrayList;

public class PictureRep{}/** implements PictureRepoInt {
    private String url="jdbc:mysql://localhost:3306/okvs?autoReconnect=true&useSSL=false";
    private String user="root";
    private String password="";
    private Connection conne;
    Image Image=null;

    private static PictureRep pictureRep=null;
    private PictureRep(){
        try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static PictureRep getPictureRep(){
        if(pictureRep==null){
            pictureRep =new PictureRep();
        }return pictureRep;
    }
    @Override
    public Picture creat(Picture picture) {
        String code=getPremier();
        System.out.println(picture.getPictureId());
        try {
            String sql="INSERT INTO PIC(PICTUR_ID ,PICTUR_DESCRIPTION ,PICTURE,IMAGE) VALUES ("+code+",'"+picture.getPicDescription()+"','"+picture.getImage()+"','"+picture.getImage()+"');";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Picture delete(String id) {
        return null;
    }

    @Override
    public Picture Update(Picture picture) {
        return null;
    }

    public Image getImage(){
        return Image;
    }
    @Override
    public Picture read(String id) {
        Picture picture=null;
        BufferedImage bi=null;
        try{
            String sql="SELECT * FROM PIC where PICTUR_ID="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs= statement.executeQuery();
            while (rs.next())
            {
                byte[] img=rs.getBytes(3);
                ImageIcon imageIcon=new ImageIcon(img);
                Image im=imageIcon.getImage();
                Image my=im.getScaledInstance(500,500,Image.SCALE_SMOOTH);
                ImageIcon newImage=new ImageIcon(my);

                if(im==null){
                    System.out.println("it's null"+im.toString());}
                System.out.println("it's not null"+im.toString());

                picture= PictureFactory.getPicture2(rs.getInt(1),rs.getString(2),"", newImage);
                 System.out.println(picture.getPictureId());
            }
        } catch (SQLException e) {
            e.printStackTrace();}

        return picture;
    }

    @Override
    public ArrayList<String> readAll() {
        return null;
    }

    @Override
    public String getPremier() {
        String highValeu="";
        try {
            String sql="select MAX(PICTUR_ID) from PIC ;";
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
}
*/