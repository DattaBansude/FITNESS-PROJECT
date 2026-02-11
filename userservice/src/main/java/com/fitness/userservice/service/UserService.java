package com.fitness.userservice.service;

import com.fitness.userservice.dto.UserRequest;
import com.fitness.userservice.dto.UserResponse;
import jakarta.validation.Valid;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

public interface UserService {
    UserResponse register(@Valid UserRequest userRequest);

    UserResponse getUserProfile(String userId);
}
