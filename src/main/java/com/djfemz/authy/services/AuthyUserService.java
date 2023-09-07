package com.djfemz.authy.services;

import com.djfemz.authy.repositories.UserRepository;
import com.djfemz.authy.models.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Base64;


@Service
@AllArgsConstructor
public class AuthyUserService implements UserService{
    private final UserRepository userRepository;
    @Override
    public User signup(String email, String password) {
        User user = new User();
        user.setEmail(email);
        password = Base64.getEncoder().encodeToString(password.getBytes());
        user.setPassword(password);
        user.setIsActive(true);
        return userRepository.save(user);
    }

}
