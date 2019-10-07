package com.etoiledespoir.onlinekvshop.repository.item.category.beaute;

import com.etoiledespoir.onlinekvshop.domain.itemBuilder.impl.BeautyMakeup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeautyRepInt extends JpaRepository<BeautyMakeup,String> {
}
