package com.etoiledespoir.onlinekvshop.domain.users.Demography.impl;

public class Gender {
    private String genderId;
    private String gender;

    private Gender() {
    }

    public String getGenderId() {
        return genderId;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "CustomerGender{" +
                "genderId='" + genderId + '\'' +
                ", gender='" + gender + '\'' +
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
            Gender CG=new Gender();
            CG.gender=this.gender;
            CG.genderId=this.genderId;
            return CG;
        }
    }
}
