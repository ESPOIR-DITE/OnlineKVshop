package com.etoiledespoir.onlinekvshop.service.user.login;

import com.etoiledespoir.onlinekvshop.domain.users.login.Login;
import com.etoiledespoir.onlinekvshop.repository.user.login.LoginRepository;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService implements Iservice<Login,String> {
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
        Login login = get(id);
        if(login!=null){
            loginRepository.delete(login);
            return login;
        }
        return null;
    }

    @Override
    public Login Update(Login login) {
        Login login1 = get(login.getEmail());
        if(login1!=null){
            delete(login1.getEmail());
            return creat(login);
        }
        return null;
    }

    @Override
    public Login read(String id) {
       return get(id);
    }
    public Login readWithPassWord(String password){
        for(Login login: readAll()){
            if(login.getPassword().equals(password)){
                return login;
            }
        }return null;
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
    public Login readWithPassword(String password){
        for (Login login:readAll()){
            if(login.getPassword().equals(password)){
                return login;
            }
        }return null;
    }

    public Login get(String id){
        Optional<Login> result=loginRepository.findById(id);
        return result.orElse(null);
    }

}
