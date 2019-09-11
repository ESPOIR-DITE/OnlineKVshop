package com.etoiledespoir.onlinekvshop.domain;

import javax.imageio.ImageIO;
import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Blob;

public class Picture {
    private int pictureId;
    private String picDescription;
    private String url;
    private File imageFile;
    private Image image;
    private BufferedImage image1;

    private Picture() {
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    public String getPicDescription() {
        return picDescription;
    }

    public void setPicDescription(String picDescription) {
        this.picDescription = picDescription;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Image getImageIcon() {return image1; }

    public void setImageIcon(File imageIcon) {
        BufferedImage resized=null;
        try {
            image1 = ImageIO.read(imageIcon);
            resized = resize(image1, 500, 500);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.image = resized;
    }


    public Image getImage() {
        if(imageFile!=null){
        setImageIcon(imageFile);}
        return image;
    }
    public Image getImageFromDB() {
        //setImageIcon(imageFile);
        return image;
    }



    private static BufferedImage resize(BufferedImage img, int height, int width) {
        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }

    public static class Builder{
        private int pictureId;
        private String picDescription;
        private String url;
        private File imageIcon;
        private Image image;
        private BufferedImage image1;


        public Builder(int pictureId){
            this.pictureId=pictureId;
        }
        public Builder buildPicDescription(String picDescription){
            this.picDescription=picDescription;
            return this;
        }
        public Builder buildUrl(String url){
            this.url=url;
            return this;
        }
        public Builder buildImageIcon(File imageIcon){
            this.imageIcon=imageIcon;
            return this;
        }
        public Builder buildImage(Image image){
            this.image=image;
            return this;
        }
        public Builder buildImage1(BufferedImage image1){
            this.image1=image1;
            return this;
        }
        public Builder buildBlob(Blob blob){
            try {
                this.image=ImageIO.read((File) blob);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return this;
        }
        public Picture getPicture(){
            Picture picture=new Picture();
            picture.pictureId=this.pictureId;
            picture.image1=this.image1;
            picture.image=this.image;
            picture.imageFile=this.imageIcon;
            picture.picDescription=this.picDescription;
            picture.url=this.url;
            return picture;
        }
    }


    /** public int getPictureId() {
        return pictureId;
    }
    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }
    public String getPicDescription() {
        return picDescription;
    }
    public void setPicDescription(String picDescription) {
        this.picDescription = picDescription;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        try {
            this.iconURL = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        this.url = url;
    }
    public ImageIcon getImageIcon() {
        return imageIcon;
    }
    public void setImageIcon(URL newIconUrl) {
        if(newIconUrl==null){
        ImageIcon icon = new ImageIcon(iconURL);}
        this.imageIcon = icon;
    }
    public Image getImage(){
        return image;
    }
    public void setImage(Image image) {
        Image i = getImageIcon().getImage();
        this.image = i;
    }
    **/

}
