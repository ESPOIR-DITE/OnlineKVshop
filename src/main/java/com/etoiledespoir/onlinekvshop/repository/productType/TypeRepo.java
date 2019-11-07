package com.etoiledespoir.onlinekvshop.repository.productType;

import com.etoiledespoir.onlinekvshop.domain.itemType.Types;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepo extends JpaRepository<Types,String> {
}
