package com.etoiledespoir.onlinekvshop.repository.size;

import com.etoiledespoir.onlinekvshop.domain.size.ProductSize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemSizeRepo extends JpaRepository<ProductSize,String> {
}
