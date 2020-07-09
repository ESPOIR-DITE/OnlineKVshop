package com.etoiledespoir.onlinekvshop.repository.user;

import com.etoiledespoir.onlinekvshop.domain.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User findByEmail(String email);
}
