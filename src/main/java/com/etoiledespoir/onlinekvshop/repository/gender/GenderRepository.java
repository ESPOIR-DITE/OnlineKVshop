package com.etoiledespoir.onlinekvshop.repository.gender;

import com.etoiledespoir.onlinekvshop.domain.gender.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenderRepository extends JpaRepository<Gender,String> {
}
