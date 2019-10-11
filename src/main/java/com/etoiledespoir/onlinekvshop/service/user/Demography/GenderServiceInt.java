package com.etoiledespoir.onlinekvshop.service.user.Demography;

import com.etoiledespoir.onlinekvshop.domain.users.Demography.Gender;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderServiceInt extends Iservice<Gender,String> {

}
