package com.etoiledespoir.onlinekvshop.domain.item.braind;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Braind {
    @Id
    private String braindId;
    private String braindName;

    private Braind() {
    }

    public String getBraindId() {
        return braindId;
    }

    public void setBraindId(String braindId) {
        this.braindId = braindId;
    }

    public String getBraindName() {
        return braindName;
    }

    public void setBraindName(String braindName) {
        this.braindName = braindName;
    }

    @Override
    public String toString() {
        return "Braind{" +
                "braindId='" + braindId + '\'' +
                ", braindName='" + braindName + '\'' +
                '}';
    }
    public static class Builder{
        private String braindId;
        private String braind;
        public Builder(String braindId){
            this.braindId=braindId;
        }
        public Builder buidBraind(String braind){
            this.braind=braind;
            return this;
        }
        public Braind build(){
            Braind b=new Braind();
            b.braindName =this.braind;
            b.braindId=this.braindId;
            return b;
        }
    }
}
