package com.etoiledespoir.onlinekvshop.domain.item.braind;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Brand {
    @Id
    private String brandId;
    private String brandName;

    private Brand() {
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String braindId) {
        this.brandId = braindId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String braindName) {
        this.brandName = braindName;
    }

    @Override
    public String toString() {
        return "Braind{" +
                "braindId='" + brandId + '\'' +
                ", braindName='" + brandName + '\'' +
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
        public Brand build(){
            Brand b=new Brand();
            b.brandName =this.braind;
            b.brandId =this.braindId;
            return b;
        }
    }
}
