package com.etoiledespoir.onlinekvshop.repository.CustomerRepo;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Customer;
import com.etoiledespoir.onlinekvshop.repository.Irepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Icustomer extends JpaRepository<Customer,String> {
    Customer findByEmail(String email);
}
