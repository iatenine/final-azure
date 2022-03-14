package com.revature.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Routes {

    @GetMapping("/")
    public String foo(){
        return "fjlkdfjl";
    }

    @GetMapping("/fruit")
    public String fruit(){
        return "Bananas and nothing else";
    }

    @PostMapping("/fruit")
    public String post(){
        return "This is a post mapping";
    }
}
