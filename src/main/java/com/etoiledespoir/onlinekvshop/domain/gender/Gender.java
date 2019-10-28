package com.etoiledespoir.onlinekvshop.domain.gender;

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
        return "Gender{" +
                "genderId='" + genderId + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
    public static class Builder{
        private String genderId;
        private String gender;
        public Builder(String genderId){
            this.gender=genderId;
        }
        public Builder buildGender(String gender){
            this.gender=gender;
            return this;
        }
        public Gender build(){
            Gender gender=new Gender();
            gender.gender=this.gender;
            gender.genderId=this.genderId;
            return gender;
        }
    }
}
