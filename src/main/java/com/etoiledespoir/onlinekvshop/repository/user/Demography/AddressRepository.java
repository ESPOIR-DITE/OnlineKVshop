package com.etoiledespoir.onlinekvshop.repository.user.Demography;

import com.etoiledespoir.onlinekvshop.domain.users.Demography.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 */
@Repository
public interface AddressRepository extends JpaRepository<Address,String> {

}
