package com.etoiledespoir.onlinekvshop.repository.itemsold.impl;

public class ItemSoldRep{}/** implements ItemSoldInt {
    private static ItemSoldRep itemSoldRep;
    ItemSold itemSold=null;

    private String url="jdbc:mysql://localhost:3306/okvs?autoReconnect=true&useSSL=false";
    private String user="root";
    private String password="";
    private Connection conne;

    private ItemSoldRep() {
        try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ItemSoldRep getItemSold(){
        if(itemSoldRep==null){
            itemSoldRep=new ItemSoldRep();
        }return itemSoldRep;
    }
    @Override
    public ItemSold creat(ItemSold itemSold) {
        int codeInt=Integer.parseInt(getPremier());
        try {
            String sql="INSERT INTO ITEM_SOLD (SOLD_ID,ITEM_ID,ORDER_ID) VALUES ("+codeInt+",'"+itemSold.getItemId()+"','"+itemSold.getOrderId()+"');";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(""+codeInt);
    }

    @Override
    public ItemSold delete(String id) {
        itemSold= ItemSoldFact.getItemS(read(id).getId(),read(id).getItemId(),read(id).getOrderId());
        //itemSold=readAllThat(id);
        try{
            String sql="DELETE FROM ITEM_SOLD where ORDER_ID in("+id+");";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return itemSold;
    }
    public ArrayList<ItemSold> delete2(String id) {
        ArrayList<ItemSold>myList=new ArrayList<>();
        myList=readAllThat(id);
        try{
            String sql="DELETE FROM ITEM_SOLD where ORDER_ID in("+id+");";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return myList;
    }

    @Override
    public ItemSold Update(ItemSold itemSold) {
        String id=""+itemSold.getId();
        try{
            String sql="UPDATE  ITEM_SOLD SET ITEM_ID='"+itemSold.getItemId()+"' WHERE SOLD_ID="+itemSold.getId()+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(id);

    }

    @Override
    public ItemSold read(String id) {

        try{
            String sql="SELECT * FROM ITEM_SOLD where SOLD_ID="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs= statement.executeQuery();
            while (rs.next())
            {
                itemSold= ItemSoldFact.getItemS(rs.getInt(1),rs.getInt(2),rs.getInt(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return itemSold;
    }

    @Override
    public ArrayList<String> readAll() {
        ArrayList<String>myList=new ArrayList<>();
        ItemSold itemSold=null;
        try{
            String sql="SELECT * FROM ITEM_SOLD;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs= statement.executeQuery();
            while (rs.next())
            {
                itemSold= ItemSoldFact.getItemS(rs.getInt(1),rs.getInt(2),rs.getInt(3));
                myList.add(itemSold.toString());
                // System.out.println(admin.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return myList;
    }
    public ArrayList<ItemSold> readAll2() {
        ArrayList<ItemSold>myList=new ArrayList<>();
        ItemSold itemSold=null;
        try{
            String sql="SELECT * FROM ITEM_SOLD;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs= statement.executeQuery();
            while (rs.next())
            {
                itemSold= ItemSoldFact.getItemS(rs.getInt(1),rs.getInt(2),rs.getInt(3));
                myList.add(itemSold);
                // System.out.println(admin.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return myList;
    }


    public ArrayList<ItemSold> readAllThat(String orderId) {
        ArrayList<ItemSold>myList=new ArrayList<>();
        ItemSold itemSold=null;
        try{
            String sql="SELECT * FROM ITEM_SOLD where ORDER_ID="+orderId+" ;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs= statement.executeQuery();
            while (rs.next())
            {
                itemSold= ItemSoldFact.getItemS(rs.getInt(1),rs.getInt(2),rs.getInt(3));
                myList.add(itemSold);
                // System.out.println(admin.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return myList;
    }

    @Override
    public String getPremier() {
        int highValeu=0;
        try {
            String sql="select MAX(SOLD_ID) from ITEM_SOLD ;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
              String  highValeus=rs.getString(1);
                highValeu=Integer.parseInt(highValeus)+1;
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }catch (NullPointerException e )
        {
            highValeu=1000;
        }catch (NumberFormatException x){ highValeu=1000;}

        if(highValeu==0){highValeu=1000;}

        return ""+highValeu;
    }
}
*/