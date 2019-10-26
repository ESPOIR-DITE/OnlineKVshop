package com.etoiledespoir.onlinekvshop.domain.item.impl.cloths;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Cloths {
    @Id
    private String itemNumber;
    private String size;
    private String matiere;

    private Cloths() {
    }
    public String getItemNumber() {
        return itemNumber;
    }
    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getMatiere() {
        return matiere;
    }
    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    @Override
    public String toString() {
        return "Cloths{" +
                ", itemNumber='" + itemNumber + '\'' +
                ", itemNumber='" + matiere + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
    public static class Builder{
        private String itemNumber;
        private String size;
        private String matiere;

        public Builder(String itemNumber){
            this.itemNumber=itemNumber;
        }
        public Builder buildSize(String size){
            this.size=size;
            return this;
        }
        public Builder buildMatiriel(String matiere){
            this.matiere=matiere;
            return this;
        }
        public Cloths build(){
            Cloths b=new Cloths();
            b.itemNumber=this.itemNumber;
            b.size=this.size;
            b.matiere=this.matiere;
            return b;
        }

    }
}
