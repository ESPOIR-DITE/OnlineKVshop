package com.etoiledespoir.onlinekvshop.domain.accounting.accountChange;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * this class will deal with every changes that happens to the items
 * recording the id of the item date of change, the initial amount of items, and deduction or increament of the item
 */
@Entity
public class AccountChange {
    @Id
    private String id;
    private String itemId;
    private String date;
    private int intialquantity;
    private int postQuantity;
    private String descriptioin;

    private AccountChange() {
    }

    public String getDescriptioin() {
        return descriptioin;
    }

    public void setDescriptioin(String descriptioin) {
        this.descriptioin = descriptioin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getIntialquantity() {
        return intialquantity;
    }

    public void setIntialquantity(int intialquantity) {
        this.intialquantity = intialquantity;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    public void setPostQuantity(int postQuantity) {
        this.postQuantity = postQuantity;
    }

    @Override
    public String toString() {
        return "AccountChange{" +
                "id='" + id + '\'' +
                ", itemId='" + itemId + '\'' +
                ", date='" + date + '\'' +
                ", intialquantity=" + intialquantity +
                ", postQuantity=" + postQuantity +
                ", descriptioin='" + descriptioin + '\'' +
                '}';
    }

    public static class Builder{
        private String id;
        private String itemId;
        private String date;
        private int intialquantity;
        private int postQuantity;
        private String descriptioin;

        public Builder(String id){
            this.id=id;
        }
        public Builder buildItemId(String itemId){
            this.itemId=itemId;
            return this;
        }
        public Builder buildDescription(String descriptioin){
            this.descriptioin=descriptioin;
            return this;
        }
        public Builder buildDate(String date){
            this.date=date;
            return this;
        }
        public Builder buildInitialQuantity(int intialquantity){
            this.intialquantity=intialquantity;
            return this;
        }
        public Builder buildPostQuantity(int postQuantity){
            this.postQuantity=postQuantity;
            return this;
        }
        public AccountChange build(){
            AccountChange a=new AccountChange();
            a.date=this.date;
            a.id=this.id;
            a.descriptioin=this.descriptioin;
            a.intialquantity=this.intialquantity;
            a.postQuantity=this.postQuantity;
            a.itemId=this.itemId;
            return a;
        }
    }
}
