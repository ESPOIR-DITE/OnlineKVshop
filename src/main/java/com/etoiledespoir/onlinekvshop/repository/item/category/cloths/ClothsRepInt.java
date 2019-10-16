package com.etoiledespoir.onlinekvshop.repository.item.category.cloths;

import com.etoiledespoir.onlinekvshop.domain.item.impl.Cloths;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClothsRepInt extends JpaRepository<Cloths,String> {
}
