package com.etoiledespoir.onlinekvshop.domain;

public class Item  {
    private String ItemNumber;
    private String name;
    private String type;

    private Item() {
    }

    public String getItemNumber() {
        return ItemNumber;
    }

    public void setItemNumber(String itemNumber) {
        ItemNumber = itemNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Item{" +
                "ItemNumber='" + ItemNumber + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    /**
     * builder start here
     */
    public static class Builder{
        private String ItemNumber;
        private String name;
        private String type;

        public Builder(String itemNumber) {
            ItemNumber = itemNumber;
        }
        public Builder buildName(String name){
            this.name=name;
            return this;
        }
        public Builder buildType(String type)
        {
            this.type=type;
            return this;
        }
        public Item build()
        {
            Item item=new Item();
            item.ItemNumber=this.ItemNumber;
            item.name=this.name;
            item.type=this.type;
            return item;
        }
    }
}
