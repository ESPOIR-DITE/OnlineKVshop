package com.etoiledespoir.onlinekvshop.domain.itemType;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Types {
    @Id
    private String id;
    private String typeName;

    private Types() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Types{" +
                "id='" + id + '\'' +
                ", typeName='" + typeName + '\'' +
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
            types.typeName =this.type;
            return types;
        }
    }
}
