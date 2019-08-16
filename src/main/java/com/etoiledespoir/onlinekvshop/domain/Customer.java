package com.etoiledespoir.onlinekvshop.domain;

import lombok.Data;

public class Customer  {
    private String name;
    private int id;
    private String email;
    private String password;
    private String address;
    private String status;
    /**
     * builder start here
     */
    public  static class Builder {
        private String name;
        private int id;
        private String email;
        private String password;
        private String address;
        private String status;

        public Builder(int id){
            this.id=id;
        }
        public Builder builName(String name){
            this.name=name;
            return this;
        }
        public Builder buildEmail(String email){
            this.email=email;
            return this;
        }
        public Builder buildPassword(String password){
            this.password=password;
            return this;
        }
        public Builder buildAddress(String address){
            this.address=address;
            return this;
        }
        public Builder buildStatus(String status){
            this.status=status;
            return this;
        }
        public Customer build(){
            Customer customer=new Customer();
            customer.id=this.id;
            customer.name=this.name;
            customer.address=this.address;
            customer.email=this.email;
            customer.password=this.password;
            customer.status=this.status;
            return customer;
        }
        public Builder copy(Customer customer){
            this.address=customer.address;
            this.name=customer.name;
            this.id=customer.id;
            this.status=customer.status;
            this.password=customer.password;
            this.email=customer.email;
            return this;
        }

    }//end Builder

    private Customer(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
