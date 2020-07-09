package com.etoiledespoir.onlinekvshop.repository.item.color;

import com.etoiledespoir.onlinekvshop.domain.item.color.impl.ItemColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemColorRep extends JpaRepository<ItemColor,String> {
}
