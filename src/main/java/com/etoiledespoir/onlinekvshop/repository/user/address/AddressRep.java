package com.etoiledespoir.onlinekvshop.repository.user.address;

import com.etoiledespoir.onlinekvshop.domain.user.address.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRep extends JpaRepository<UserAddress,String> {
}
