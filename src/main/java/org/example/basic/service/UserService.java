package org.example.basic.service;

import org.example.basic.dto.SaveUser;
import org.example.basic.entity.User;
import org.example.basic.repositor.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(SaveUser saveUser){
        User user = new User(saveUser.getName(),saveUser.getDescription());
        return userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }
}
