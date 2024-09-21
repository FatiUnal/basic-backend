package org.example.basic.controller;

import org.example.basic.dto.SaveUser;
import org.example.basic.entity.User;
import org.example.basic.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> save(@RequestBody SaveUser saveUser){
        return new ResponseEntity<>(userService.save(saveUser),HttpStatus.OK);
    }
}
