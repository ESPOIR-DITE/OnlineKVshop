package com.etoiledespoir.onlinekvshop.repository.AdminRepo;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Admin;
import com.etoiledespoir.onlinekvshop.factory.domain.AdminFactory;

import java.sql.*;
import java.util.ArrayList;

public class AdminRepository implements Iadmin {
    //http://localhost/phpmyadmin/db_sql.php?db=okvs
    private String url="jdbc:mysql://localhost:3306/okvs2?autoReconnect=true&useSSL=false";
    private String user="root";
    private String password="";
    private Connection conne;

    private static AdminRepository adm=null;

    private AdminRepository() {
        try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public  static AdminRepository getAdm()
    {
        if(adm==null){
            adm=new AdminRepository();
        }return adm;
    }
    @Override
    public Admin creat(Admin admin) {
        String code=getPremier();
        try {
        String sql="INSERT INTO admin(CODE,NAME,USERNAME,PASSWORDS) VALUES ("+code+",'"+admin.getName()+"','"+admin.getUserName()+"','"+admin.getPassword()+"');";
        PreparedStatement statement=conne.prepareStatement(sql);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(code);
    }

    @Override
    public Admin delete(String id) {
        Admin admin=AdminFactory.buildAdmin(read(id).getName(),read(id).getId(),read(id).getUserName(),read(id).getPassword());
        try{
            String sql="DELETE FROM admin where CODE="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return admin;
    }

    @Override
    public Admin Update(Admin admin) {


        try{
            String sql="UPDATE  admin SET NAME='"+admin.getName()+"',USERNAME='"+admin.getUserName()+"',PASSWORDS="+admin.getPassword()+" WHERE CODE="+admin.getId()+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(""+admin.getId());
    }
    @Override
    public Admin read(String id) {
        Admin admin=null;
        try{
            String sql="SELECT * FROM admin where CODE="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs= statement.executeQuery();
            while (rs.next())
            {
                admin= AdminFactory.buildAdmin(rs.getString(2),rs.getInt(1),rs.getString(3),rs.getString(4));
               // System.out.println(admin.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return admin;
    }



    @Override
    public ArrayList<String> readAll() {
        ArrayList<String>myList=new ArrayList<>();
        Admin admin=null;
        try{
            String sql="SELECT * FROM admin;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs= statement.executeQuery();
            while (rs.next())
            {
                admin= AdminFactory.buildAdmin(rs.getString(2),rs.getInt(1),rs.getString(3),rs.getString(4));
                myList.add(admin.toString());
               // System.out.println(admin.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return myList;
    }

    @Override
    public String getPremier() {
        String highValeu="";
        try {
            String sql="select MAX(CODE) from admin ;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs=statement.executeQuery();
            while(rs.next())
            {
                highValeu=rs.getString(1);
                int x=Integer.parseInt(highValeu)+1;
                highValeu=""+x;
            }
        }catch (SQLException e)
        {
            e.printStackTrace();
        }catch (NullPointerException e )
        {
            highValeu="1000";
        }catch (NumberFormatException x){ highValeu="1000";}

        if(highValeu==null){highValeu="1000";}
        //System.out.println(highValeu);

        return highValeu;

    }
}
