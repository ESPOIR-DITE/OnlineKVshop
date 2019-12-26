package com.etoiledespoir.onlinekvshop.repository.special;

import com.etoiledespoir.onlinekvshop.domain.specials.ItemSpecial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemSpecialRepo extends JpaRepository<ItemSpecial,String> {
}
