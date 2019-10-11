package com.etoiledespoir.onlinekvshop.service.itemService.category.beaute;

import com.etoiledespoir.onlinekvshop.domain.itemBuilder.impl.BeautyMakeup;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface BeautyServiceInt extends Iservice<BeautyMakeup,String> {
}
