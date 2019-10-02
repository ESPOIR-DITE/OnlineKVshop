package com.etoiledespoir.onlinekvshop.domain.order;

import com.etoiledespoir.onlinekvshop.domain.ItemSold;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
@Entity
public class Order{
    @Id
private String orderNumber;
private int customer_id;
private ArrayList<ItemSold>items;
private String date;

    private Order(){}
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getCustomer() {
        return customer_id;
    }

    public void setCustomer(int customer_id) {
        this.customer_id = customer_id;
    }

    public ArrayList<ItemSold> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemSold> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                ", customer=" + customer_id +
                ", items=" + items +
                ", date=" + date +
                '}';
    }
    /**
     * builder start here
     */
    public static class Builder{
        private String orderNumber;
        private int customer_id;
        private ArrayList<ItemSold>items;
        private String date;

        public Builder(String orderNumber) {
            this.orderNumber = orderNumber;
        }
        public Builder buildDate(String date)
        {
            this.date=date;
            return this;
        }
        public Builder buildCustomer(int customer_id){
            this.customer_id=customer_id;
            return this;
        }
        public Builder buildItem(ArrayList<ItemSold>items){
            this.items=items;
            return this;
        }
        public Order build()
        {
            Order order=new Order();
            order.items=this.items;
            order.customer_id=this.customer_id;
            order.date=this.date;
            order.orderNumber=this.orderNumber;
            return order;
        }
    }
}
