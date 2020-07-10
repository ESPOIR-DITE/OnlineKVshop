package com.etoiledespoir.onlinekvshop.domain.user.login;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
    @Id
    private String email;
    private String password;
    private String userType;

    private Login() {
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userTupe) {
        this.userType = userTupe;
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

    @Override
    public String toString() {
        return "Login{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userTupe='" + userType + '\'' +
                '}';
    }
    public static class Builder{
        private String email;
        private String password;
        private String userTupe;
        public Builder(String email){
            this.email=email;
        }
        public Builder buildPassword(String password){
            this.password=password;
            return this;
        }
        public Builder buildUserType(String userTupe){
            this.userTupe=userTupe;
            return this;
        }
        public Login build(){
            Login login=new Login();
            login.email=this.email;
            login.password=this.password;
            login.userType =this.userTupe;
            return login;
        }
    }
}
