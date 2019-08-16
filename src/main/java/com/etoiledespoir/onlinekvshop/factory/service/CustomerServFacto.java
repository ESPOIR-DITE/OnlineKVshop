package com.etoiledespoir.onlinekvshop.factory.service;

import com.etoiledespoir.onlinekvshop.service.customerService.CustomerService;

public class CustomerServFacto {
    public static CustomerService getCustser(){
        return CustomerService.getCustServ();
    }
}
