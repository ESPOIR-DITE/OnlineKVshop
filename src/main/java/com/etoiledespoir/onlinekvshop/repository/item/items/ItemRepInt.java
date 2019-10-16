package com.etoiledespoir.onlinekvshop.repository.item.items;

import com.etoiledespoir.onlinekvshop.domain.item.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepInt extends JpaRepository<Items,String> {
}
