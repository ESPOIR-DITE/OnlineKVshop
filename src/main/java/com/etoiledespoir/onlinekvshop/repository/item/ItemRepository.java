package com.etoiledespoir.onlinekvshop.repository.item;

import com.etoiledespoir.onlinekvshop.domain.item.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Items,String> {
}
