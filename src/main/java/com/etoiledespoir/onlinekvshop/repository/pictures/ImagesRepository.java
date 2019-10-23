package com.etoiledespoir.onlinekvshop.repository.pictures;

import com.etoiledespoir.onlinekvshop.domain.pictures.Images;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagesRepository extends JpaRepository<Images,String> {
}
