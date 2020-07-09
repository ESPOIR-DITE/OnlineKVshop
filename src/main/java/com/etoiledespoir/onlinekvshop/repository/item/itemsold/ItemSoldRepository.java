package com.etoiledespoir.onlinekvshop.repository.item.itemsold;

import com.etoiledespoir.onlinekvshop.domain.item.itemSold.ItemSold;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemSoldRepository extends JpaRepository<ItemSold,String> {
}
