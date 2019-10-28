package com.etoiledespoir.onlinekvshop.repository.gender;

import com.etoiledespoir.onlinekvshop.domain.gender.bridge.ItemGender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemGenderRep extends JpaRepository<ItemGender,String> {
}
