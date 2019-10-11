package com.etoiledespoir.onlinekvshop.repository.user.userType.AdminRepo;

import com.etoiledespoir.onlinekvshop.domain.users.userType.impl.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminInt extends JpaRepository<Admin, String> {

}
