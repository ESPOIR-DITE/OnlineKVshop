package com.etoiledespoir.onlinekvshop.repository.product;

import com.etoiledespoir.onlinekvshop.domain.item.impl.allItems.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepo extends JpaRepository<ProductType,String> {
}
