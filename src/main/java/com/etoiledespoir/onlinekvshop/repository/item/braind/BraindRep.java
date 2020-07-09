package com.etoiledespoir.onlinekvshop.repository.item.braind;

import com.etoiledespoir.onlinekvshop.domain.item.braind.Braind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BraindRep extends JpaRepository<Braind,String> {
}
