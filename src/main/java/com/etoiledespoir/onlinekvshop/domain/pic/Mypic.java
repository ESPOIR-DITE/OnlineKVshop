package com.etoiledespoir.onlinekvshop.domain.pic;

import java.util.Arrays;

public class Mypic {
    private String id;
    private byte[] image;

    private Mypic() {
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
        return "Mypic{" +
                "id='" + id + '\'' +
                ", image=" + Arrays.toString(image) +
                '}';
    }
    public static class Builder{
        private String id;
        private byte[] image;
        public Builder(String id){
            this.id=id;
        }
        public Builder buildImage(byte[] image){
            this.image=image;
            return this;
        }
        public Mypic build(){
            Mypic mypic=new Mypic();
            mypic.id=this.id;
            mypic.image=this.image;
            return mypic;
        }
    }
}
