package com.etoiledespoir.onlinekvshop.repository.item.special;

import com.etoiledespoir.onlinekvshop.domain.item.specials.ItemSpecial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemSpecialRepo extends JpaRepository<ItemSpecial,String> {
}
