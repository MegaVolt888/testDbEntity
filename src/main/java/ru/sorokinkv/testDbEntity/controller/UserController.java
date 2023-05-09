package ru.sorokinkv.testDbEntity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.sorokinkv.testDbEntity.Dto.UserDto;
import ru.sorokinkv.testDbEntity.model.UserEntity;
import ru.sorokinkv.testDbEntity.service.UserService;
import ru.sorokinkv.testDbEntity.service.UserServiceImpl;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    public UserServiceImpl userService;

    @GetMapping("/getAll")
    public ResponseEntity<List<UserEntity>> getAll(){
        List<UserEntity> all = userService.findAll();
        return ResponseEntity.ok(all);
    }

    @PostMapping("/save")
    public ResponseEntity<UserEntity> save(@RequestBody UserDto userDto){
        return ResponseEntity.ok(userService.save(userDto.getEntity()));
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<UserEntity> getById(@PathVariable Integer id){
        return ResponseEntity.ok(userService.findById(id));
    }
}
