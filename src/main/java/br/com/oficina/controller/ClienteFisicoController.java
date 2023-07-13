package br.com.oficina.controller;

import br.com.oficina.domain.cliente.fisico.DadosCadastroPessoaFisica;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clienteFisico")
public class ClienteFisicoController {


    //Testando se esta recebendo a requisição
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPessoaFisica dados){
        System.out.println(dados);
    }
}
