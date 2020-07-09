package com.etoiledespoir.onlinekvshop.repository.item.pictures;

import com.etoiledespoir.onlinekvshop.domain.generic.item_picture.itemImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Item_pictureRepository extends JpaRepository<itemImage,String> {
}
