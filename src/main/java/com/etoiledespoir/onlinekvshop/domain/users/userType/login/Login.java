package com.etoiledespoir.onlinekvshop.domain.users.userType.login;

import java.time.LocalDate;

public class Login {
    private String email;
    private String password;
    private String userTupe;

    private Login() {
    }

    public String getUserTupe() {
        return userTupe;
    }

    public void setUserTupe(String userTupe) {
        this.userTupe = userTupe;
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
                ", userTupe='" + userTupe + '\'' +
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
            login.userTupe=this.userTupe;
            return login;
        }
    }
}
