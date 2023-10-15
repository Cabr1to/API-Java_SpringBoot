package br.com.luisbrito.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/primeiraRota")
// http://localhost:8080/primeiraRota/primeiroMetodo
public class MinhaPrimeiraController {
    /**
     * Metodos de acesso do HTTP
     * GET -Buscar uma info
     * POST - Adicionar um dado/info
     * PUT - Alterar um dado/info
     * DELETE - Remover um dado
     * PATCH - Alterar somente uma parte da info/dado
    */
    //Metodo de (Funcionalidade) de uma classe
    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem() {
        return "Funcionou";
    }

}