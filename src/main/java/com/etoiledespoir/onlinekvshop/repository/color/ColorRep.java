package com.etoiledespoir.onlinekvshop.repository.color;

import com.etoiledespoir.onlinekvshop.domain.color.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRep extends JpaRepository<Color,String> {
}
