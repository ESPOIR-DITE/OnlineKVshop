package com.etoiledespoir.onlinekvshop.domain.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class UserRole {
    @Id
    private String id;
    private String email;
    private String roleId;
    private Date date;
    private String description;
    private String actor;

    private UserRole() {
    }

    public UserRole(Builder builder) {
        this.id = builder.id;
        this.actor = builder.actor;
        this.date = builder.date;
        this.description = builder.description;
        this.actor = builder.actor;
        this.email= builder.email;
        this.roleId = builder.roleId;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    public String getRoleId() {
        return roleId;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getActor() {
        return actor;
    }
    public static class Builder{
        private String id;
        private String email;
        private String roleId;
        private Date date;
        private String description;
        private String actor;

        public Builder(String id){
            this.id = id;
        }
        public Builder buildEmail(String email){
            this.email = email;
            return this;
        }
        public Builder buildRoleId(String roleId){
            this.roleId = roleId;
            return this;
        }
        public Builder buildDate(Date date){
            this.date = date;
            return this;
        }
        public Builder buildDescription(String description){
            this.description = description;
            return this;
        }
        public Builder buildActor(String actor){
            this.actor = actor;
            return this;
        }
        public Builder copy(UserRole userRole){
            this.id = userRole.id;
            this.actor = userRole.actor;
            this.date = userRole.date;
            this.description = userRole.description;
            this.actor = userRole.actor;
            this.email= userRole.email;
            this.roleId = userRole.roleId;
            return this;
        }
        public UserRole build(){
            return new UserRole(this);
        }
    }
}
