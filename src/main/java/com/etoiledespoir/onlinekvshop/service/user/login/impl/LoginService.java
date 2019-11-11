package com.etoiledespoir.onlinekvshop.service.user.login.impl;

import com.etoiledespoir.onlinekvshop.domain.users.login.Login;
import com.etoiledespoir.onlinekvshop.repository.user.userType.login.LoginRepository;
import com.etoiledespoir.onlinekvshop.service.user.login.LoginServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService implements LoginServiceInt {
    @Autowired
    private LoginRepository loginRepository;

    private static LoginService loginService;

    private LoginService() {
    }

    public static LoginService getLoginService(){
        if(loginService==null){
            loginService=new LoginService();
        }return loginService;
    }
    @Override
    public Login creat(Login login) {
        return loginRepository.save(login);
    }

    @Override
    public Login delete(String id) {
        Optional<Login> result=loginRepository.findById(id);
        loginRepository.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public Login Update(Login login) {
        return loginRepository.save(login);
    }

    @Override
    public Login read(String id) {
        Optional<Login> result=loginRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<Login> readAll() {
        return loginRepository.findAll();
    }
    public Login loging(String email,String password){
        List<Login> result=loginRepository.findAll();
        for(Login login: result){
            if(login.getEmail().equals(email)&&login.getPassword().equals(password)){
                return login;
            }
        }
        return null;
    }
}
