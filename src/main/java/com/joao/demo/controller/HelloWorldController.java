package com.joao.demo.controller;

import com.joao.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //recebe requisicoes e repostatas http pra aplicacao
@RequestMapping("/hello-world") //o final e endpoint que adiciona a url
public class HelloWorldController {

    @Autowired //O Spring cria o objeto pra você e entrega pronto dentro da sua classe.
    private HelloWorldService helloWorldService;

    /*
    public HelloWorldController(HelloWorldService helloWorldService){
        this.helloWorldService =helloWorldService;     #o construtor vira o autowired que e injetado, nao tao bom
    }*/

    //pode ser post, get, delete, put, patch, options, head; o metodo http q a classe abaixo vai responder
    @GetMapping //pode adicionar mais um endpoint
    public String helloWorld(){
        return helloWorldService.helloworld("joao");
    }
}
