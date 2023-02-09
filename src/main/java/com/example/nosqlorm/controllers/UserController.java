package com.example.nosqlorm.controllers;

import com.example.nosqlorm.entities.User;
import com.example.nosqlorm.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/getallusers")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @PostMapping("/postuser")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping("/updateuser/{id}")
    public User editUser(@PathVariable String id, @RequestBody User user){
        user.setId(id);
        return  userRepository.save(user);
    }

    @DeleteMapping("/deleteuser/{id}")
    public void deleteUser(@PathVariable String id){
        userRepository.deleteById(id);
    }
}
