package com.example.cursorestfulspringbootiniciante.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    

    @GetMapping("/cliente")
    public String getCliente()
    {
        return "Vai retornar TODOS os clientes";
    }

    @GetMapping("/cliente/{codigo}")
        public String getCliente(@PathVariable int codigo){
        return "Vai retornar UM Cliente pelo codigo" + codigo;
    }

}
