package com.djfemz.authy.services;

import com.djfemz.authy.models.User;

public interface UserService {
    User signup(String email, String password);

}
