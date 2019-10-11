package com.etoiledespoir.onlinekvshop.service.user.bridge;

import com.etoiledespoir.onlinekvshop.domain.users.userType.bridge.CustomerBridge;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CustomerBridgeServiceInt extends Iservice<CustomerBridge,String> {

}
