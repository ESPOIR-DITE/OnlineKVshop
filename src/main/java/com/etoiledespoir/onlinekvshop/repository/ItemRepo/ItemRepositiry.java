package com.etoiledespoir.onlinekvshop.repository.ItemRepo;

import com.etoiledespoir.onlinekvshop.domain.Item;
import com.etoiledespoir.onlinekvshop.factory.domain.CustomerFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.ItemFactory;
import com.etoiledespoir.onlinekvshop.factory.repository.ItemRepoFactory;

import java.sql.*;
import java.util.ArrayList;

public class ItemRepositiry implements ItemRepo {
    private String highValeu=null;
    private static ItemRepositiry itemR=null;
    private String url="jdbc:mysql://localhost:3306/okvs?autoReconnect=true&useSSL=false";
    private String user="root";
    private String password="";
    private Connection conne;

    private ItemRepositiry() {
        try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ItemRepositiry getItemR()
    {
        if(itemR==null){
            itemR=new ItemRepositiry();
        }return itemR;
    }
    @Override
    public Item creat(Item item) {
        String code=getPremier();
        int codeInt=Integer.parseInt(code);
        try {
            String sql="INSERT INTO item(ITEMNUMBER,NAME,TYPE) VALUES ("+codeInt+",'"+item.getName()+"','"+item.getType()+"');";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(code);
    }

    @Override
    public Item delete(String id) {

        try{
            String sql="DELETE FROM item WHERE ITEMNUMBER='"+id+"';";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(id);
    }

    @Override
    public Item Update(Item item) {
        String id=item.getItemNumber();
        try{
            String sql="UPDATE  item SET NAME='"+item.getName()+"',TYPE='"+item.getType()+"' WHERE ITEMNUMBER='"+id+"';";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(id);

    }

    @Override
    public Item read(String id) {
        Item item=null;
        try{
            String sql="SELECT * FROM item where ITEMNUMBER="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs= statement.executeQuery();
            while (rs.next())
            {
                item= ItemFactory.builItem(rs.getString(1),rs.getString(2),rs.getString(3));
                // System.out.println(admin.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return item;
    }

    @Override
    public ArrayList<String> readAll() {
        ArrayList<String> myList=new ArrayList<>();

        Item item=null;
        try{
            String sql="SELECT * FROM item ;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs= statement.executeQuery();
            while (rs.next())
            {
                item= ItemFactory.builItem(rs.getString(1),rs.getString(2),rs.getString(3));
                myList.add(item.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return myList;
    }

    @Override
    public String getPremier() {

        try {
            String sql="select MAX(ITEMNUMBER) from item ;";
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

    public ArrayList<Item>getCustItems(String id){

        ArrayList<Item> myList=new ArrayList<>();

        Item item=null;
        try{
            String sql="SELECT * FROM item ;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs= statement.executeQuery();
            while (rs.next())
            {
                myList.add(ItemFactory.builItem(rs.getString(1),rs.getString(2),rs.getString(3)));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return myList;

    }
}
