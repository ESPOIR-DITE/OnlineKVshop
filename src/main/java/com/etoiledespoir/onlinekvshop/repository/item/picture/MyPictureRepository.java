package com.etoiledespoir.onlinekvshop.repository.item.picture;

import com.etoiledespoir.onlinekvshop.domain.item.pic.Mypic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyPictureRepository extends JpaRepository<Mypic,String> {
}
