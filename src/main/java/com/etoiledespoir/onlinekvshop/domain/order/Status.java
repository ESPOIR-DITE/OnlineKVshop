package com.etoiledespoir.onlinekvshop.domain.order;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Status {
    @Id
    private String id;
    private String stat;

    private Status() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    @Override
    public String toString() {
        return "Status{" +
                "id='" + id + '\'' +
                ", stat='" + stat + '\'' +
                '}';
    }

    public static class Builder{
        private String id;
        private String stat;

        public Builder(String id){
            this.id=id;
        }
        public Builder buildStat(String stat){
            this.stat=stat;
            return this;
        }
        public Status build(){
            Status status=new Status();
            status.id=this.id;
            status.stat=this.stat;
            return status;
        }
    }
}
