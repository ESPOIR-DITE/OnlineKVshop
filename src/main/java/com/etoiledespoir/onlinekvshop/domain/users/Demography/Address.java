package com.etoiledespoir.onlinekvshop.domain.users.Demography;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
    @Id
    private String id;
    private String commun;
    private String quartier;
    private String avenue;
    private int numero;

    private Address() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommun() {
        return commun;
    }

    public void setCommun(String commun) {
        this.commun = commun;
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public String getAvenue() {
        return avenue;
    }

    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", commun='" + commun + '\'' +
                ", quartier='" + quartier + '\'' +
                ", avenue='" + avenue + '\'' +
                ", numero=" + numero +
                '}';
    }
    public static class Builder{
        private String id;
        private String commun;
        private String quartier;
        private String avenue;
        private int numero;
        public Builder(String id){
            this.id=id;
        }
        public Builder buildCommune(String commun){
            this.commun=commun;
            return this;
        }
        public Builder buildQuartier(String quartier){
            this.quartier=quartier;
            return this;
        }
        public Builder buildAvenue(String avenue){
            this.avenue=avenue;
            return this;
        }
        public Builder buildNumbero(int numero){
            this.numero=numero;
            return this;
        }
        public Address build(){
            Address A= new Address();
            A.avenue=this.avenue;
            A.commun=this.commun;
            A.id=this.id;
            A.quartier=this.quartier;
            A.numero=this.numero;
            return A;
        }
    }
}
