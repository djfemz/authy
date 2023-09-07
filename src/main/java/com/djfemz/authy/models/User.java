package com.djfemz.authy.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@ToString
@Document
public class User {
    private String email;
    private String password;
    @Id
    private String id;
    private Boolean isActive;

}
