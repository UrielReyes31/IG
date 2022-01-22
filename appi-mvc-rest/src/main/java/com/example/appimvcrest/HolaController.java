package com.example.appimvcrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
    @GetMapping("hola")
    public String saludos(){
        return "hola uia ";
    }
}
