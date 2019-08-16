package com.etoiledespoir.onlinekvshop.controller;

import com.etoiledespoir.onlinekvshop.controller.admin.AdminController;
import com.etoiledespoir.onlinekvshop.controller.customer.CustomerController;
import com.etoiledespoir.onlinekvshop.controller.item.ItemController;
import com.etoiledespoir.onlinekvshop.controller.order.OrderController;
import com.etoiledespoir.onlinekvshop.controller.payment.PaymentController;
import com.etoiledespoir.onlinekvshop.domain.*;
import com.etoiledespoir.onlinekvshop.factory.domain.CustomerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Path;
import java.util.ArrayList;

@RestController
@RequestMapping("/OKVS")
public class Controller {
    private static HttpServletRequest request;


    String value=null;
    @Autowired
    CustomerController customer;
    @Autowired
    AdminController admin;
    @Autowired
    ItemController item;
    @Autowired
    PaymentController payment;
    @Autowired
    OrderController order;



/**
    @RequestMapping("/{name}/reads")
    public ArrayList<String> readAll(@PathVariable String name){
        //System.out.println(request.getServletPath());
       // System.out.println(request.getRequestURI());
        System.out.println(name);
        System.out.println();

        switch (name){
            case "customer":
                return customer.readAll();
            case "admin":
                return admin.readAll();
            case "item":
                return item.readAll();
            case "order":
                return order.readAll();
            case "payment":
                return payment.readAll();
        }

         return null;
    }



    public String getCustomer(HttpServletRequest request){

        String name=request.getParameter("name");
        String urlName=request.getQueryString();
        String url2=request.getRequestURI();
        String url3=request.getServletPath();
       System.out.println(urlName);
       return "hello"+name+""+urlName+" "+url2+" "+url3;
    }

    @GetMapping("/{name}/read")
    public Idomain read(@PathVariable String name,@RequestParam(value = "id") String id )
    {
        System.out.println("name:  "+name);
        System.out.println("id:  "+id );
        switch (name){
            case "customer":
                return customer.read(id);
            case "admin":
                return admin.read(id);
            case "item":
                return item.read(id);
            case "order":
                return order.read(id);
            case "payment":
                return payment.read(id);
        }


        return null;
    }
    @GetMapping("/{name}/delete")
    public String delete(@PathVariable String name,@RequestParam(value = "id") String id )
    {
        System.out.println("name:  "+name);
        System.out.println("id:  "+id );
        switch (name){
            case "customer":
                return ""+customer.delete(id);
            case "admin":
                return ""+admin.delete(id);
            case "item":
                return ""+item.delete(id);
            case "order":
                return ""+order.delete(id);
            case "payment":
                return ""+payment.delete(id);
        }return null;
    }**/
}
