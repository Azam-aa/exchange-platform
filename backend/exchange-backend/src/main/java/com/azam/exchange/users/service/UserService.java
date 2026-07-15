package com.azam.exchange.users.service;

import com.azam.exchange.users.dto.RegisterRequest;
import com.azam.exchange.users.dto.RegisterResponse;

public interface UserService {

    RegisterResponse register(RegisterRequest request);

}