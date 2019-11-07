package com.etoiledespoir.onlinekvshop.repository.gender;

import com.etoiledespoir.onlinekvshop.domain.gender.bridge.CustomerGender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerGenderRep extends JpaRepository<CustomerGender,String> {
}
