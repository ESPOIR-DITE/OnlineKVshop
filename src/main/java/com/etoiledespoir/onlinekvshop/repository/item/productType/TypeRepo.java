package com.etoiledespoir.onlinekvshop.repository.item.productType;

import com.etoiledespoir.onlinekvshop.domain.item.itemType.TypeOfItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepo extends JpaRepository<TypeOfItem,String> {
}
