package com.etoiledespoir.onlinekvshop.factory.service;

import com.etoiledespoir.onlinekvshop.service.user.userType.customerService.impl.CustomerService;

public class CustomerServFacto {
    public static CustomerService getCustomerservice(){
        return CustomerService.getCustServ();
    }

}
