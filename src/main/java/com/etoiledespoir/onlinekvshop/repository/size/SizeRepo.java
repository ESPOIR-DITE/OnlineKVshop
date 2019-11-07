package com.etoiledespoir.onlinekvshop.repository.size;

import com.etoiledespoir.onlinekvshop.domain.size.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepo extends JpaRepository<Size,String> {
}
