package com.goit.Mod15Developer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping(value = "user")
    public String getTestData() {
        return "test user data";
    }
}