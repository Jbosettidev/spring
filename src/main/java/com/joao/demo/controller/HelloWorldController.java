package com.joao.demo.controller;

import com.joao.demo.domain.User;
import com.joao.demo.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //recebe requisicoes e repostatas http pra aplicacao
@RequestMapping("/hello-world") //o final e endpoint que adiciona a url
public class HelloWorldController {

    @Autowired //O Spring cria o objeto pra você e entrega pronto dentro da sua classe. injetada
    private HelloWorldService helloWorldService;

    /*
    public HelloWorldController(HelloWorldService helloWorldService){
        this.helloWorldService =helloWorldService;     #o construtor vira o autowired que e injetado, nao tao bom
    }*/

    @GetMapping //pode adicionar mais um endpoint
    public String helloWorld(){
        return helloWorldService.helloworld("joao");
    }

    @PostMapping("/{id}")  //usado quando você quer enviar dados para o servidor,
    public String helloWorldPost(@PathVariable("id") String id ,@RequestParam(value = "filter", defaultValue =  "nenhum") String filter ,@RequestBody User body){
        //requestBody sempre precisa de getter e setter pra ler Json
        //@PathVariable Usa quando o valor faz parte do caminho da URL ex buscar por id.
        //@RequestParam Usa quando o valor vem na query string (depois do ?). ex Filtros
        return "Hello World "+ body.getName() + id + filter;
    }
}
