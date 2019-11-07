package com.etoiledespoir.onlinekvshop.repository.product;

import com.etoiledespoir.onlinekvshop.domain.item.impl.allItems.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Products,String> {
}
