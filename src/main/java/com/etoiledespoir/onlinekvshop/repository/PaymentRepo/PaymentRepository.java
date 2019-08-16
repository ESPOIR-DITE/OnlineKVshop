package com.etoiledespoir.onlinekvshop.repository.PaymentRepo;

import com.etoiledespoir.onlinekvshop.domain.Admin;
import com.etoiledespoir.onlinekvshop.domain.Payment;
import com.etoiledespoir.onlinekvshop.factory.domain.AdminFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.PaymentFactory;
import com.etoiledespoir.onlinekvshop.repository.OrderRepo.OrderRepository;

import java.sql.*;
import java.util.ArrayList;

public class PaymentRepository implements Ipayment {
    private static PaymentRepository paym =null;
    private Payment payment;

    private String url="jdbc:mysql://localhost:3306/okvs?autoReconnect=true&useSSL=false";
    private String user="root";
    private String password="";
    private Connection conne;

    private PaymentRepository() {
        try {
            this.conne = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static PaymentRepository getPaym() {
        if(paym==null){
            paym=new PaymentRepository();
        }
        return paym;
    }

    @Override
    public Payment creat(Payment payment) {
        String code=getPremier();
        try {
            String sql="INSERT INTO payment(PAYMENT_NUMBER,PAYMENT_TYPE,AMOUNT,CUSTOMER_CODE) VALUES ("+code+",'"+payment.getPaymentType()+"',"+payment.getAmount()+",'"+payment.getCustomer()+"');";
            PreparedStatement statement=conne.prepareStatement(sql);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(code);
    }

    @Override
    public Payment delete(String id) {
        payment= PaymentFactory.getPayment(read(id).getPaymentNUmber(),read(id).getPaymentType(),read(id).getAmount(),read(id).getCustomer());
        try{
            String sql="DELETE FROM payment where PAYMENT_NUMBER="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return payment;
    }

    @Override
    public Payment Update(Payment payment) {
        try{
            String sql="UPDATE  payment SET PAYMENT_TYPE='"+payment.getPaymentType()+"',AMOUNT="+payment.getAmount()+",CUSTOMER_CODE='"+payment.getCustomer()+"' WHERE PAYMENT_NUMBER="+payment.getPaymentNUmber()+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return read(payment.getPaymentNUmber());
    }

    @Override
    public Payment read(String id) {

        try{
            String sql="SELECT * FROM payment where PAYMENT_NUMBER="+id+";";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs= statement.executeQuery();
            while (rs.next())
            {
                payment= PaymentFactory.getPayment(rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return payment;
    }

    @Override
    public ArrayList<String> readAll() {
        ArrayList<String>myList=new ArrayList<>();

        try{
            String sql="SELECT * FROM payment;";
            PreparedStatement statement=conne.prepareStatement(sql);
            ResultSet rs= statement.executeQuery();
            while (rs.next())
            {
                payment= PaymentFactory.getPayment(rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
                myList.add(payment.toString());
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
            String sql="select MAX(PAYMENT_NUMBER) from payment ;";
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
