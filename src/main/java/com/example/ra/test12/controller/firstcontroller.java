package com.example.ra.test12.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstcontroller {

    @RequestMapping("/")
    public String GetMessage() {
        return "test message from FirstController";
    }

}
