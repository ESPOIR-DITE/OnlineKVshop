package com.etoiledespoir.onlinekvshop.domain.item.impl.hair;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Hair {
    @Id
    private String ItemNumber;
    private String logueur;
    private String material;
    @Column(name = "hair_description" )
    private String poids;

    private Hair() {
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
    }

    public String getLogueur() {
        return logueur;
    }

    public void setLogueur(String logueur) {
        this.logueur = logueur;
    }

    public String getPoids() {
        return poids;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

    @Override
    public String toString() {
        return "Hair{" +
                "ItemNumber='" + ItemNumber + '\'' +
                ", logueur='" + logueur + '\'' +
                ", material='" + material + '\'' +
                ", poids='" + poids + '\'' +
                '}';
    }

    public static class Builder{
        private String ItemNumber;
        private String poids;
        private String logueur;
        private String material;

        public Builder(String itemNumber){
            this.ItemNumber=itemNumber;
        }
        public Builder buildPoids(String poids){
            this.poids=poids;
            return this;
        }
        public Builder buildLongueur(String logueur){
            this.logueur=logueur;
            return this;
        }
        public Builder buildMaterial(String material){
            this.material=material;
            return this;
        }

    public Hair build(){
        Hair h=new Hair();
        h.logueur=this.logueur;
        h.poids=this.poids;
        h.ItemNumber=this.ItemNumber;
        h.material=this.material;
        return h;
    }}
}
