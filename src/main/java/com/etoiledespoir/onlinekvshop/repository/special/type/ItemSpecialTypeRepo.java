package com.etoiledespoir.onlinekvshop.repository.special.type;

import com.etoiledespoir.onlinekvshop.domain.specials.type.SpecialType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemSpecialTypeRepo extends JpaRepository<SpecialType,String> {
}
