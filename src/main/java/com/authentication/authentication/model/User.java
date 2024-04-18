package com.authentication.authentication.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "accountNonExpired")
    private boolean accountNonExpired;

    @Column(name = "credentialNonExpired")
    private boolean credentialNonExpired;

    @Column(name = "accountNonLocked")
    private boolean accountNonLocked;
}
