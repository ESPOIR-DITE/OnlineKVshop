package com.etoiledespoir.onlinekvshop.repository.user;


import com.etoiledespoir.onlinekvshop.domain.user.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Roles, String> {

}
