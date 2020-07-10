package com.etoiledespoir.onlinekvshop.repository.user.gender;

import com.etoiledespoir.onlinekvshop.domain.user.gender.UserGender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGenderRep extends JpaRepository<UserGender,String> {
}
