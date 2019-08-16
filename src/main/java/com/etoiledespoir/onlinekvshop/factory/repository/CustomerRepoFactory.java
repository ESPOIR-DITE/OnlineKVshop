package com.etoiledespoir.onlinekvshop.factory.repository;

import com.etoiledespoir.onlinekvshop.repository.CustomerRepo.CustomerRepository;


public class CustomerRepoFactory {


    public static CustomerRepository getCustomerRep()
    {
        return CustomerRepository.getCust();
    }
}
