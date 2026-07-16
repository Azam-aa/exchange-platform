package com.azam.exchange.users.service.impl;

import com.azam.exchange.common.enums.Role;
import com.azam.exchange.common.exception.UserAlreadyExistsException;
import com.azam.exchange.users.dto.RegisterRequest;
import com.azam.exchange.users.dto.RegisterResponse;
import com.azam.exchange.users.entity.User;
import com.azam.exchange.users.repository.UserRepository;
import com.azam.exchange.users.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository,
                           BCryptPasswordEncoder passwordEncoder) {

        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;

    }

    @Override
    public RegisterResponse register(RegisterRequest request) {

        // Check email already exists

        if (userRepository.existsByEmail(request.getEmail())) {

            throw new UserAlreadyExistsException(
                    "Email already registered."
            );

        }

        // Check contact already exists

        if (userRepository.existsByContactNumber(request.getContactNumber())) {

            throw new UserAlreadyExistsException(
                    "Contact number already exists."
            );

        }

        // Convert DTO to Entity

        User user = User.builder()

                .firstName(request.getFirstName())

                .lastName(request.getLastName())

                .contactNumber(request.getContactNumber())

                .email(request.getEmail())

                .password(passwordEncoder.encode(request.getPassword()))

                .role(Role.USER)

                .isActive(true)

                .emailVerified(false)

                .build();

        // Save User

        User savedUser = userRepository.save(user);

        // Return Response

        return new RegisterResponse(

                savedUser.getId(),

                "User Registered Successfully."

        );

    }

}