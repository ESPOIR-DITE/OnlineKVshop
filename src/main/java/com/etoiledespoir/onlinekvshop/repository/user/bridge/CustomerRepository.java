package com.etoiledespoir.onlinekvshop.repository.user.bridge;

import com.etoiledespoir.onlinekvshop.domain.users.userType.bridge.CustomerBridge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.Id;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerBridge,String> {

}
