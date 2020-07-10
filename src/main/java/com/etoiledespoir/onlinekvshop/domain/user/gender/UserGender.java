package com.etoiledespoir.onlinekvshop.domain.user.gender;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserGender {
    @Id
    private String id;
    private String customerId;
    private String genderId;
    private String age;

    public UserGender() {
    }

    public String getId() {
        return id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getGenderId() {
        return genderId;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CustomerGender{" +
                "customerId='" + customerId + '\'' +
                ", genderId='" + genderId + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String customerId;
        private String genderId;
        private String age;

        public Builder(String customerId){
            this.customerId=customerId;
        }
        public Builder buildId(String id){
            this.id =id;
            return this;
        }
        public Builder buildGenderId(String genderId){
            this.genderId=genderId;
            return this;
        }
        public Builder buildAge(String age){
            this.age=age;
            return this;
        }
        public UserGender build(){
            UserGender cd=new UserGender();
            cd.age=this.age;
            cd.customerId=this.customerId;
            cd.genderId=this.genderId;
            cd.id = this.id;
            return cd;
        }
    }
}
