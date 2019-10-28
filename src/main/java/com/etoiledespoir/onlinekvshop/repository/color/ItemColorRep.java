package com.etoiledespoir.onlinekvshop.repository.color;

import com.etoiledespoir.onlinekvshop.domain.color.impl.ItemColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemColorRep extends JpaRepository<ItemColor,String> {
}
