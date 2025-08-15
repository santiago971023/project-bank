package com.microservice.user.application.impl;

import com.microservice.user.application.dtos.SignUpRequestDTO;
import com.microservice.user.application.ports.in.CreateUserUseCasePort;
import com.microservice.user.application.ports.out.UserRepositoryPort;
import com.microservice.user.domain.User;

public class UserServiceImpl implements CreateUserUseCasePort {

    private final UserRepositoryPort userRepositoryPort;

    public UserServiceImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public void signUp(SignUpRequestDTO signUpRequestDTO) {

        User userToCreate = new User();
        userToCreate.setFirstName(signUpRequestDTO.getFirstName());
        userToCreate.setLastName(signUpRequestDTO.getLastName());
        userToCreate.setEmail(signUpRequestDTO.getEmail());
        userToCreate.setPassword(signUpRequestDTO.getPassword());
        userRepositoryPort.save(userToCreate);

    }

}
