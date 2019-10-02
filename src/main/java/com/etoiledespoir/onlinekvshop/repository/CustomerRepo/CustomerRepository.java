package com.etoiledespoir.onlinekvshop.repository.CustomerRepo;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Customer;
import com.etoiledespoir.onlinekvshop.factory.domain.CustomerFactory;

import java.sql.*;
import java.util.ArrayList;

public class CustomerRepository implements Icustomer {
    private static CustomerRepository cust=null;

    private String url="jdbc:mysql://localhost:3306/okvs?autoReconnect=true&useSSL=false";
    private String user="root";
    private String password="";
    private Connection conne;

    private CustomerRepository() {
        try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static CustomerRepository getCust()
    {
        if(cust==null){
            cust=new CustomerRepository();
        }return cust;
    }

    @Override
    public Customer creat(Customer customer) {

        String code=getPremier();
        try {
            String sql="INSERT INTO customer(ID,NAME,EMAIL,PASSWORDS,ADDRESS,STATU) VALUES ("+code+",'"+customer.getName()+"','"+customer.getEmail()+"','"+customer.getPassword()+"','"+customer.getAddress()+"','"+customer.getStatus()+"');";
            PreparedStatement statement=conne.prepareStatement(sql);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(code);

    }

    @Override
    public Customer delete(String id) {

        Customer customer=CustomerFactory.buildCustomer(read(id).getName(),read(id).getId(),read(id).getEmail(),read(id).getPassword(),read(id).getAddress(),read(id).getStatus());
        try{
            String sql="DELETE FROM customer where ID="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public Customer Update(Customer customer) {
        try{
            String sql="UPDATE  customer SET NAME='"+customer.getName()+"',EMAIL='"+customer.getEmail()+"',PASSWORDS='"+customer.getPassword()+"',ADDRESS='"+customer.getAddress()+"',STATU='"+customer.getStatus()+"' WHERE ID="+customer.getId()+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(""+customer.getId());
    }

    @Override
    public Customer read(String id) {
        Customer cust=null;
        try{
            String sql="SELECT * FROM customer where ID="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs= statement.executeQuery();
            while (rs.next())
            {
                cust= CustomerFactory.buildCustomer(rs.getString(2),rs.getInt(1),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                // System.out.println(admin.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cust;
    }

    @Override
    public ArrayList<String> readAll() {
        ArrayList<String>myList= new ArrayList<>();
        Customer cust=null;
        try{
            String sql="SELECT * FROM customer ;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs= statement.executeQuery();
            while (rs.next())
            {
                cust= CustomerFactory.buildCustomer(rs.getString(2),rs.getInt(1),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                myList.add(cust.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return myList;

    }

    @Override
    public String getPremier(){
        String highValeu="";
        try {
        String sql="select MAX(ID) from customer ;";
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

        if(highValeu==null){highValeu="1000";}
        System.out.println(highValeu);

        return highValeu;

}
}
