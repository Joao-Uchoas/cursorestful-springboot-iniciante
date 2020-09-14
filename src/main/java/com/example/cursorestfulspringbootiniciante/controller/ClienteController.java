package com.example.cursorestfulspringbootiniciante.controller;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    List <Cliente> clientes;

    @PostConstruct
    public void criarClientes(){
        Cliente c1 = new Cliente(); 
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();

        c1.codigo = 1;
        c1.endereco = "Rua X, 63";  
        c1.nome = "Luana";
        c1.saldo = 369;

        c2.codigo = 2;
        c2.endereco = "Rua Y, 94";  
        c2.nome = "Ana";
        c2.saldo = 581;

        c3.codigo = 100;
        c3.endereco = "Rua Z, 32";  
        c3.nome = "Carla";
        c3.saldo = 759;


        clientes = Arrays.asList(c1,c2,c3);
    }

    @GetMapping("/clientes")
    public List<Cliente> getCliente()
    {
        return clientes;
    }

    @GetMapping("/clientes/{codigo}")
    public Cliente getCliente(@PathVariable int codigo){
        
        Cliente cli=null;
        for(Cliente aux : clientes){
            if(aux.codigo == codigo){
                cli = aux;
                break; 
            }

        }
        return cli;
    }

}
