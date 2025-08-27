package com.knlox.knlox_reminder.controller;

import com.knlox.knlox_reminder.dto.LoginDto;
import com.knlox.knlox_reminder.dto.ResgisterDto;
import com.knlox.knlox_reminder.entity.User;
import com.knlox.knlox_reminder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody ResgisterDto dto) {
        return ResponseEntity.ok(userService.register(dto));
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDto dto) {
        return ResponseEntity.ok("Login API (JWT will be added here)");
    }

}


