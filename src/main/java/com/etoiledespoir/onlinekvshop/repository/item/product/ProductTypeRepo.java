package com.etoiledespoir.onlinekvshop.repository.item.product;

import com.etoiledespoir.onlinekvshop.domain.item.impl.allItems.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepo extends JpaRepository<ItemType,String> {
}
