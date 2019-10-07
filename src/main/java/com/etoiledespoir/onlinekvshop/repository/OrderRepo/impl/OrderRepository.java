package com.etoiledespoir.onlinekvshop.repository.OrderRepo.impl;


public class OrderRepository{}/** implements Iorder {
    private String url="jdbc:mysql://localhost:3306/okvs?autoReconnect=true&useSSL=false";
    private String user="root";
    private String password="";
    private Connection conne;
    private String highValeu;
    private static OrderRepository ord=null;

    ItemRepo itemRepo=ItemRepoFactory.getItem();
    ItemSoldRep itemSoldRep= SoldeRepFact.getItemSold();
    ItemSold itemSold;

    private Order order;

    private int itemNumber;

    private OrderRepository() {
        try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static OrderRepository getOrd()
    {
        if(ord==null){
            ord=new OrderRepository();
        }return ord;
    }
    @Override
    public Order creat(Order order) {

        String code=getPremier();
        int codeInt=Integer.parseInt(code);
        //this will create all the item that a customer select in through is order
         //these record will be saved in the item_sold table

        for(int i=0;i<order.getItems().size();i++){
            itemSold= ItemSoldFact.getItemS(Integer.parseInt(itemSoldRep.getPremier()),order.getItems().get(i).getItemId(),codeInt);
            itemSoldRep.creat(itemSold);
        }

        try {
            String sql="INSERT INTO orders(ORDERNUMBER,CUSTOMER_CODE,ORDER_DATE) VALUES ("+codeInt+",'"+order.getCustomer() +"','"+order.getDate()+"');";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(code);
    }
    @Override
    public Order delete(String id) {
        ArrayList<ItemSold> myItems=new ArrayList<>();
        myItems=itemSoldRep.delete2(id);

        order=OrderFactory.buildOrder(read(id).getOrderNumber(),read(id).getCustomer(),myItems,read(id).getDate());

        try{
            String sql="DELETE FROM orders WHERE ORDERNUMBER='"+id+"';";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return order;
    }

     // THIS METHOD WILL ALLOW THE USER TO ONLY UPDATE THE CUSTOMER ID AND THE ONE ITEM AT A TIME!!!!

    @Override
    public Order Update(Order order) {

         //here we are going to get the all object but the update of the item will depends on the Item_sold ID
         //so the update will happen on one item at a time

        itemSoldRep.Update(order.getItems().get(0));
        try{
            String sql="UPDATE  orders SET CUSTOMER_CODE="+order.getCustomer()+" WHERE ORDERNUMBER='"+order.getOrderNumber()+"';";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(order.getOrderNumber());
    }
    @Override
    public Order read(String id) {


         //we first read Item_sold

        ArrayList<ItemSold> myItems=new ArrayList<>();
        ItemRepositiry items= ItemRepoFactory.getItem();
        myItems=itemSoldRep.readAllThat(id);


         // we secondly read order

        try{
            String sql="SELECT * FROM orders where ORDERNUMBER="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs= statement.executeQuery();
            while (rs.next())
            {
                order=OrderFactory.buildOrder(rs.getString(1),rs.getInt(2),myItems,rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
            //System.out.println(order.toString());
            return order;
    }
    @Override
    public ArrayList<String> readAll() {
        ArrayList<String> myList=new ArrayList<>();
        ArrayList<ItemSold> myItems=new ArrayList<>();
        ItemRepositiry items= ItemRepoFactory.getItem();
        myItems=itemSoldRep.readAll2();
        Order order=null;
        try{
            String sql="SELECT * FROM orders ;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs= statement.executeQuery();
            while (rs.next())
            {
                order= OrderFactory.buildOrder(rs.getString(1),rs.getInt(2),myItems,rs.getString(3));
                myList.add(order.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return myList;
    }
    @Override
    public String getPremier() {


        try {
            String sql="select MAX(ORDERNUMBER) from orders ;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
                highValeu=rs.getString(1);
                int x=Integer.parseInt(highValeu)+1;
                highValeu=""+x+"".trim();

            }
        }catch (SQLException e)
        {
            e.printStackTrace();
            highValeu="1000";
        }catch (NumberFormatException x){ highValeu="1000";}
        catch (NullPointerException y){ highValeu="1000";}
        if(highValeu==null){ highValeu="1000";}
        return highValeu;
    }
}
*/