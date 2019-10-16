package com.etoiledespoir.onlinekvshop.repository.item.category.shoes;

import com.etoiledespoir.onlinekvshop.domain.item.impl.Shoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoeasRepInt extends JpaRepository<Shoes,String> {
}
