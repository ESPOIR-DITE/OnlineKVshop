package com.etoiledespoir.onlinekvshop.domain;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Pictures2 {
    private String id;
    private String name;
    private String url;
    private String desciption;
    private File file;
    private Image image;

    private Pictures2() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Pictures2{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", desciption='" + desciption +
                '}';
    }

    public static class Builder{
        private String id;
        private String name;
        private String url;
        private String desciption;
        private File file;
        private Image image;
        private BufferedImage bufferedImage;

        public Builder(String id){
            this.id=id;
        }
        public Builder buildName(String name){
            this.name=name;
            return this;
        }
        public Builder buildUrl(String url){
            this.url=url;
            return this;
        }
        public Builder buildDescription(String desciption){
            this.desciption=desciption;
            return this;
        }
        public Builder buildFile(File file){
            try {
                bufferedImage= ImageIO.read(file);
                Image myimage=resize(bufferedImage,500,500);
                buildImage(myimage);
            } catch (IOException e) {
                e.printStackTrace();
            }

            this.file=file;
            return this;
        }
        public Builder buildImage(Image image){
            this.image=image;
            return this;
        }
        private static BufferedImage resize(BufferedImage img, int height, int width) {
            Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = resized.createGraphics();
            g2d.drawImage(tmp, 0, 0, null);
            g2d.dispose();
            return resized;
        }
        public Pictures2 getPicture2(){
            Pictures2 pictures2=new Pictures2();
            pictures2.desciption=this.desciption;
            pictures2.file=this.file;
            pictures2.id=this.id;
            pictures2.image=this.image;
            pictures2.name=this.name;
            pictures2.url=this.url;
            return pictures2;
        }

    }
}
