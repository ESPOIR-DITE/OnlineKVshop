package com.etoiledespoir.onlinekvshop.repository.user.address.impl;

import com.etoiledespoir.onlinekvshop.domain.users.address.AddressType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressTypeRep extends JpaRepository<AddressType,String> {
}
