package com.azam.exchange.users.controller;

import com.azam.exchange.users.dto.RegisterRequest;
import com.azam.exchange.users.dto.RegisterResponse;
import com.azam.exchange.users.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {

        this.userService = userService;

    }

    @PostMapping("/register")

    public RegisterResponse register(

            @Valid @RequestBody RegisterRequest request

    ) {

        return userService.register(request);

    }

}