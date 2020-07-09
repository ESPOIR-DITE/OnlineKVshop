package com.etoiledespoir.onlinekvshop.repository.item.size;

import com.etoiledespoir.onlinekvshop.domain.item.size.ItemSize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemSizeRepo extends JpaRepository<ItemSize,String> {
}
