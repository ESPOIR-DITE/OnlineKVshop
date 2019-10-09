package com.etoiledespoir.onlinekvshop.repository.bridge;

import com.etoiledespoir.onlinekvshop.domain.users.userType.bridge.CustomerBridge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerBridgeRepInt extends JpaRepository<CustomerBridge,String> {
}
