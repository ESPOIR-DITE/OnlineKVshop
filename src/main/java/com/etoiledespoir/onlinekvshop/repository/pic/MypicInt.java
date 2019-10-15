package com.etoiledespoir.onlinekvshop.repository.pic;

import com.etoiledespoir.onlinekvshop.domain.pic.Mypic;
import com.etoiledespoir.onlinekvshop.repository.Irepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MypicInt extends JpaRepository<Mypic,String> {
}
