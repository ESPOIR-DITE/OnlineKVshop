package com.etoiledespoir.onlinekvshop.repository.item.beaute;

import com.etoiledespoir.onlinekvshop.domain.item.impl.beate.BeautyMakeup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeautyRepInt extends JpaRepository<BeautyMakeup,String> {
}
