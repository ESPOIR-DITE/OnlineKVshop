package com.etoiledespoir.onlinekvshop.domain.pictures;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.awt.*;
import java.util.Arrays;
@Entity
public class Images {
    @Id
    private String id;
    private byte[] image;

    private Images() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Images{" +
                "id='" + id + '\'' +
                ", image=" + Arrays.toString(image) +
                '}';
    }

    public static class Builder {
        private String id;
        private byte[] image;

        public Builder(String id) {
            this.id = id;
        }

        public Builder buildImage(byte[] image) {
            this.image = image;
            return this;
        }

        public Images build() {
            Images im = new Images();
            im.id = this.id;
            im.image = this.image;
            return im;
        }
    }
}
