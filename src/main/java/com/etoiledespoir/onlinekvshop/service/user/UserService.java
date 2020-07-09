package com.etoiledespoir.onlinekvshop.service.user;

import com.etoiledespoir.onlinekvshop.domain.users.User;
import com.etoiledespoir.onlinekvshop.repository.user.UserRepository;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements Iservice<User,String> {
    private static UserService userService =null;
    @Autowired
    UserRepository userRepository;
    private  UserService() {
    }
    public static UserService getUserService(){
        if(userService ==null){
            userService =new UserService();
        }return userService;
    }
    @Override
    public User creat(User user) {
        return userRepository.save(user);
    }

    @Override
    public User delete(String id) {
        User user1 = get(id);
        if(user1!=null){
            userRepository.delete(user1);
            return user1;
        }
        return null;
    }

    @Override
    public User Update(User user) {
    User user1 = get(user.getEmail());
        if(user1!=null){
            userRepository.delete(user1);
            userRepository.save(user);
        }
        return null;
    }

    @Override
    public User read(String email) {
        return get(email);
    }


    @Override
    public List<User> readAll() {
        return userRepository.findAll();
    }

    public User get(String id){
        Optional<User> mycustomer= userRepository.findById(id);
        return mycustomer.orElse(null);
    }
}
