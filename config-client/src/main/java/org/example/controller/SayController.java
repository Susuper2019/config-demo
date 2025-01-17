package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "say")
@RefreshScope
public class SayController {
    @Value(value = "${name:123}")
    String name;

    @GetMapping(value = "hello")
    public String say() {
        return name;
    }
}
