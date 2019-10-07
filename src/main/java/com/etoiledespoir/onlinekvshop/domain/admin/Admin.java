package com.etoiledespoir.onlinekvshop.domain.admin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin  {
@Id
    private int id;
    @Column(name = "Admin_name" )
    private String name;
    private String userName;
    private String password;

    private Admin() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    /**
     * builder start here
     */
    public static class Builder
    {
        private int id;
        private String name;
        private String userName;
        private String password;

        public Builder(String name) {
            this.name = name;
        }
        public Builder buildId(int id){
            this.id=id;
            return this;
        }
        public Builder buildUserName(String userName){
            this.userName=userName;
            return this;
        }
        public Builder builderPassword(String password){
            this.password=password;
            return this;
        }
        public Admin builAdmin(){
            Admin admin= new Admin();
            admin.userName=this.userName;
            admin.name=this.name;
            admin.password=this.password;
            admin.id=this.id;
            return admin;

        }
    }
}
