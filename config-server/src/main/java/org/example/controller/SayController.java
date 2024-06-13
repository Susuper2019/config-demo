package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "say")
public class SayController {
    @GetMapping(value = "hello")
    public String say() {
        return "say";
    }
}
