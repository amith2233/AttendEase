package com.example.attendease.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class urlController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome to AttendEase";
    }

}
