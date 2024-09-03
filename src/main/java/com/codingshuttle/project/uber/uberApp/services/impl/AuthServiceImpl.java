package com.codingshuttle.project.uber.uberApp.services.impl;

import com.codingshuttle.project.uber.uberApp.dto.DriverDTO;
import com.codingshuttle.project.uber.uberApp.dto.SignUpDTO;
import com.codingshuttle.project.uber.uberApp.dto.UserDTO;
import com.codingshuttle.project.uber.uberApp.entities.User;
import com.codingshuttle.project.uber.uberApp.entities.enums.Role;
import com.codingshuttle.project.uber.uberApp.exceptions.RuntimeConflictException;
import com.codingshuttle.project.uber.uberApp.repositories.UserRepository;
import com.codingshuttle.project.uber.uberApp.services.AuthService;
import com.codingshuttle.project.uber.uberApp.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;
    private final RiderService riderService;

    // TODO: Implement this
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDTO signup(SignUpDTO signUpDTO) {
        User existingUser = userRepository.findByEmail(signUpDTO.getEmail())
                .orElseThrow(() -> new RuntimeConflictException("Cannot Signup! A user with this email already exists!"));
        User user = modelMapper.map(signUpDTO, User.class);
        user.setRoles(Set.of(Role.RIDER));
        User savedUser = userRepository.save(user);

        // Create User related entities
        riderService.createRider(savedUser);
        // TODO: Add wallet service and create a wallet here


        return modelMapper.map(savedUser, UserDTO.class);
    }

    @Override
    public DriverDTO onboardDriver(Long userID) {
        return null;
    }
}
