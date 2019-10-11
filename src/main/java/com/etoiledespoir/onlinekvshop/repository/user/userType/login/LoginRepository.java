package com.etoiledespoir.onlinekvshop.repository.user.userType.login;

import com.etoiledespoir.onlinekvshop.domain.users.login.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login,String> {

}
