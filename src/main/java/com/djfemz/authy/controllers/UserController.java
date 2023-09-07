package com.djfemz.authy.controllers;

import com.djfemz.authy.models.User;
import com.djfemz.authy.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @MutationMapping
    public User addUser(@Argument String email,@Argument String password){
        return userService.signup(email, password);
    }


    @QueryMapping
    public User getUser(@Argument Integer id){
       return null;
    }
}
