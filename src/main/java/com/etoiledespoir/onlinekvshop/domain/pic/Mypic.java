package com.etoiledespoir.onlinekvshop.domain.pic;



import org.apache.commons.io.FileUtils;

import javax.imageio.ImageIO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

@Entity
public class Mypic {
    @Id
    private String id;
    private String itemId;
    private byte[] image;
    @Column(name = "pic_description" )
    private String description;

    private Mypic() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return encodeImage(this.image);

    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Mypic{" +
                "id='" + id + '\'' +
                ", itemId='" + itemId + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder {
        private String id;
        private String itemId;
        private byte[] image;
        private String description;


        public Builder(String id) {
            this.id = id;
        }

        /**public Builder buildImage(String image) {
            this.image = image;
            return this;
        }*/

        public Builder buildItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }

        public Builder buildDesc(String description){
            this.description=description;
            return this;
        }
        public Builder buildImage(File file) {
            BufferedImage bufferedImage = null;
            String myImage = null;
            if (file != null) {
                try {
                    this.image = FileUtils.readFileToByteArray(file);

                   // this.image = encodeImage(fileContent);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return this;
        }

        public Mypic build() {
            Mypic mypic = new Mypic();
            mypic.id = this.id;
            mypic.image = this.image;
            mypic.itemId = this.itemId;
            mypic.description=this.description;
            return mypic;
        }
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

    public static String encodeImage(byte[] imageByteArray) {
        String string = java.util.Base64.getEncoder().encodeToString(imageByteArray);
        return string;
    }
}
