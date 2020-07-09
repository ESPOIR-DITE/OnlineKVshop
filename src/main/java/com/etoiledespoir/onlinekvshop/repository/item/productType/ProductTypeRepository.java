package com.etoiledespoir.onlinekvshop.repository.item.productType;

import com.etoiledespoir.onlinekvshop.domain.item.itemType.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends JpaRepository<ItemType,String> {
}
