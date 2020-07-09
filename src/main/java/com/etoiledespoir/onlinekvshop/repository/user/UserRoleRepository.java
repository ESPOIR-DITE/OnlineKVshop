package com.etoiledespoir.onlinekvshop.repository.user;

import com.etoiledespoir.onlinekvshop.domain.users.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole,String> {
}
