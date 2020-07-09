package com.etoiledespoir.onlinekvshop.repository.item;

import com.etoiledespoir.onlinekvshop.domain.item.gender.ItemGender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemGenderRep extends JpaRepository<ItemGender,String> {
}
