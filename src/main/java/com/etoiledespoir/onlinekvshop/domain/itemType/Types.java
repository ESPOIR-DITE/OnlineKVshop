package com.etoiledespoir.onlinekvshop.domain.itemType;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Types {
    @Id
    private String id;
    private String type;

    private Types() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Types{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    public static class Builder{
        private String id;
        private String type;
        public Builder(String id){
            this.id=id;
        }
        public Builder buildType(String type){
            this.type=type;
            return this;
        }
        public Types build(){
            Types types=new Types();
            types.id=this.id;
            types.type=this.type;
            return types;
        }
    }
}
