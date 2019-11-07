package com.etoiledespoir.onlinekvshop.repository.productType;

import com.etoiledespoir.onlinekvshop.domain.itemType.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends JpaRepository<ItemType,String> {
}
