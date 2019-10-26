package com.etoiledespoir.onlinekvshop.repository.user.Demography;

import com.etoiledespoir.onlinekvshop.domain.users.address.impl.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 */
@Repository
public interface AddressRepository extends JpaRepository<Address,String> {

}
