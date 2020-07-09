package com.etoiledespoir.onlinekvshop.repository.item.special;

import com.etoiledespoir.onlinekvshop.domain.item.specials.type.SpecialType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemSpecialTypeRepo extends JpaRepository<SpecialType,String> {
}
