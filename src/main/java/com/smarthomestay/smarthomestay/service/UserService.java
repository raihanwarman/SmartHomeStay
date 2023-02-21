package com.smarthomestay.smarthomestay.service;

import com.smarthomestay.smarthomestay.entity.User;
import com.smarthomestay.smarthomestay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user){
        return repository.save(user);
    }

    public List<User> saveUsers(List<User> users){
        return repository.saveAll(users);
    }

    public List<User> getUsers(){
        return repository.findAll();
    }

    public User getUserById(Integer id){
        return repository.findById(id).orElse(null);
    }

    public String deleteUser(Integer id){
        repository.deleteById(id);
        return "Product removed !!" +id;
    }

    public User updateUser(User user){
        User existingUser = repository.findById(user.getId()).orElse(null);
        existingUser.setName(user.getName());
        existingUser.setPassword(user.getPassword());
        existingUser.setCheck_in_status(user.getCheck_in_status());
        return repository.save((existingUser));
    }
}
