package com.etoiledespoir.onlinekvshop.domain.user.gender;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gender {
    @Id
    private String genderId;
    private String genderName;

    private Gender() {
    }

    public String getGenderId() {
        return genderId;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "genderId='" + genderId + '\'' +
                ", genderName='" + genderName + '\'' +
                '}';
    }
    public static class Builder{
        private String genderId;
        private String gender;
        public Builder(String genderId){
            this.genderId=genderId;
        }
        public Builder buildGender(String gender){
            this.gender=gender;
            return this;
        }
        public Gender build(){
            Gender gender=new Gender();
            gender.genderName =this.gender;
            gender.genderId=this.genderId;
            return gender;
        }
    }
}
