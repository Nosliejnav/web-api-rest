package com.example.web.api.rest.controller;

import com.example.web.api.rest.model.Usuario;
import com.example.web.api.rest.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping("/users")
    public List<Usuario> getUsers(){
        return repository.findAll();
    }

}
