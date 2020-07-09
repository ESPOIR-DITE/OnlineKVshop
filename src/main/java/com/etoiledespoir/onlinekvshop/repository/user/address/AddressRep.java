package com.etoiledespoir.onlinekvshop.repository.user.address;

import com.etoiledespoir.onlinekvshop.domain.users.address.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRep extends JpaRepository<Address,String> {
}
