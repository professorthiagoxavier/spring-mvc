package com.fiap.myapp.controllers;

import com.fiap.myapp.exceptions.CustomException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

    @GetMapping("/trigger-error")
    public String triggerError() {
        throw new CustomException("Algo deu errado, aluno!");
    }
}
