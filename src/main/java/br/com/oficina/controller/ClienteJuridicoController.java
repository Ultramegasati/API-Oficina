package br.com.oficina.controller;


import br.com.oficina.domain.cliente.juridico.DadosCadastroPessoaJuridica;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clienteJuridico")
public class ClienteJuridicoController {


    //Testando se esta recebendo a requisição
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPessoaJuridica dados){
        System.out.println(dados);
    }
}
