package com.etoiledespoir.onlinekvshop.repository.braind;

import com.etoiledespoir.onlinekvshop.domain.braind.impl.ItemBraind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemBraindRep extends JpaRepository<ItemBraind,String> {
}
