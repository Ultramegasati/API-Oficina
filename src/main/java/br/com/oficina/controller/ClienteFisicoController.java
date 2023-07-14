package br.com.oficina.controller;

import br.com.oficina.domain.cliente.fisico.DadosCadastroPessoaFisica;
import br.com.oficina.domain.cliente.fisico.PessoaFisica;
import br.com.oficina.domain.cliente.fisico.PessoaFisicaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clienteFisico")
public class ClienteFisicoController {

    @Autowired
    private PessoaFisicaRepository repository;


    //Testando se esta recebendo a requisição
    @PostMapping
    @Transactional  // para ter transação ativa com bd;para poder escrever no bd
    public void cadastrar(@RequestBody   @Valid DadosCadastroPessoaFisica dados){
        //System.out.println(dados);

    repository.save(new PessoaFisica(dados));//dados, pegando do construtor





    }
}
