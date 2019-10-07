package com.etoiledespoir.onlinekvshop.repository.item.category.hair;

import com.etoiledespoir.onlinekvshop.domain.itemBuilder.impl.Hair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HairRepInt extends JpaRepository<Hair,String> {
}
