package com.etoiledespoir.onlinekvshop.repository.user.login;

import com.etoiledespoir.onlinekvshop.domain.user.login.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login,String> {

}
