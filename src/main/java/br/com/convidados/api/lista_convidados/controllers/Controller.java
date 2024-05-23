package br.com.convidados.api.lista_convidados.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.convidados.api.lista_convidados.models.Convidados;
import br.com.convidados.api.lista_convidados.repository.RepositoryConvidados;

@RestController
public class Controller {
    
    @Autowired
    private RepositoryConvidados actionConvidados;

    @PostMapping("/convidados/cadastro")
    public Convidados cadastro (@RequestBody Convidados convidado) {
        return actionConvidados.save(convidado);
    }
    
    @GetMapping("/")
    public String texto () {
        return "<h1>Olá Mundo</h1>";
    }

/*
    @PostMapping("/convidados")
    public Convidados pessoas (@RequestBody Convidados p) {
        return p;
    }
*/
}
