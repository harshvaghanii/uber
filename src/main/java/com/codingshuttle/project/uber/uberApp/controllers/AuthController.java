package com.codingshuttle.project.uber.uberApp.controllers;

import com.codingshuttle.project.uber.uberApp.dto.SignUpDTO;
import com.codingshuttle.project.uber.uberApp.dto.UserDTO;
import com.codingshuttle.project.uber.uberApp.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping(path = "/signup")
    public UserDTO signUP(@RequestBody SignUpDTO signUpDTO) {
        return authService.signup(signUpDTO);
    }

}
