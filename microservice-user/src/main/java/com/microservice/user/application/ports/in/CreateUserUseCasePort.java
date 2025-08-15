package com.microservice.user.application.ports.in;

import com.microservice.user.application.dtos.SignUpRequestDTO;

public interface CreateUserUseCasePort {

    public void signUp(SignUpRequestDTO signUpRequestDTO);

}
