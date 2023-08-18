package br.com.criandoapi.springjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    @GetMapping("/usuarios")
    public String texto (){
        return "Acessando a api!";
    }        
}
