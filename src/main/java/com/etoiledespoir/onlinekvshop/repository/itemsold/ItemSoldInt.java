package com.etoiledespoir.onlinekvshop.repository.itemsold;

import com.etoiledespoir.onlinekvshop.domain.itemSold.ItemSold;
import com.etoiledespoir.onlinekvshop.repository.Irepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemSoldInt extends JpaRepository<ItemSold,String> {
}
