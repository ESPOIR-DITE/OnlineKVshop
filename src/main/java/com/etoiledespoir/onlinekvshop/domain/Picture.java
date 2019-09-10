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

    public File getImageIcon() {return imageFile; }

    public void setImageIcon(File imageIcon) {
       this.imageFile = imageIcon;
        try {
            image = ImageIO.read(imageIcon);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Image getImage() {
        return image1;
    }

    public void setImage(BufferedImage image) {
        this.image1 = image;
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
        public Picture getPicture(){
            Picture picture=new Picture();
            picture.pictureId=this.pictureId;
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
