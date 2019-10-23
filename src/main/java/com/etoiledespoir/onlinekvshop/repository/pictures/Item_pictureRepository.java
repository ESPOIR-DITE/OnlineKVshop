package com.etoiledespoir.onlinekvshop.repository.pictures;

import com.etoiledespoir.onlinekvshop.domain.generic_class.item_picture.Item_Pictures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Item_pictureRepository extends JpaRepository<Item_Pictures,String> {
}
