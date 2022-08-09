package com.example.validation_exception_handling.service;

import com.example.validation_exception_handling.dto.UserRequest;
import com.example.validation_exception_handling.entity.User;
import com.example.validation_exception_handling.exception.UserNotFoundException;
import com.example.validation_exception_handling.repository.UserRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;
    public User saveUser(UserRequest userRequest){
        User user = User.build(0,userRequest.getName(),
                userRequest.getEmail(),userRequest.getMobile(),
                userRequest.getGender(), userRequest.getAge(),
                userRequest.getNationality());
    return repository.save(user);
    }
    public List<User> getAllUsers(){
        return repository.findAll();
    }
    public User getUser(int id) throws UserNotFoundException {
        User user = repository.findByUserId(id);
        if(user!=null){
            return user;
        }else{
            throw new UserNotFoundException("User with id: "+id+" not found!");
        }
    }
}
