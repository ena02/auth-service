package com.ena.bank.authservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("auth")
public class UserController {

    @GetMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
