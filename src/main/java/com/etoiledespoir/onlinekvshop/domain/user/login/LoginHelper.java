package com.etoiledespoir.onlinekvshop.domain.user.login;

/**
 * not sure about the use of this class in the controller????????????
 */
public class LoginHelper {
    private String email;
    private String pasword;

    private LoginHelper() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    @Override
    public String toString() {
        return "LoginHelper{" +
                "email='" + email + '\'' +
                ", pasword='" + pasword + '\'' +
                '}';
    }
}
