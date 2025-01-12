package com.fiap.myapp.controllers;

import com.fiap.myapp.models.ExampleModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ContentNegotiationController {

    @GetMapping("/example-content-negotiation")
    public ExampleModel getExample() {
        return new ExampleModel("Hello", "World");
    }
}