package com.etoiledespoir.onlinekvshop.domain.gender.bridge;

public class CustomerGender {
    private String customerId;
    private String genderId;
    private String age;

    public CustomerGender() {
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
        private String customerId;
        private String genderId;
        private String age;

        public Builder(String customerId){
            this.customerId=customerId;
        }
        public Builder buildGenderId(String genderId){
            this.genderId=genderId;
            return this;
        }
        public Builder buildAge(String age){
            this.age=age;
            return this;
        }
        public CustomerGender build(){
            CustomerGender cd=new CustomerGender();
            cd.age=this.age;
            cd.customerId=this.customerId;
            cd.genderId=this.genderId;
            return cd;
        }
    }
}
