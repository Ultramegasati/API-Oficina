package br.com.oficina.controller;



import br.com.oficina.domain.cliente.juridico.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clienteJuridico")
public class ClienteJuridicoController {


    @Autowired
    private PessoaJuridicaRepository repository;


    //Testando se esta recebendo a requisição
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody  @Valid DadosCadastroPessoaJuridica dados){
        //System.out.println(dados);

        repository.save(new PessoaJuridica(dados));

    }

    @GetMapping
    public Page<DadosListagemDePessoaJuridica> listar(@PageableDefault(size = 10,sort = {"razaoSocial"})Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemDePessoaJuridica :: new);
    }


    @GetMapping("/listarVeiculo")
    public Page<DadosListagemVeiculoPessoaJurdica> listarVeiculo(@PageableDefault(size = 10,sort = {"razaoSocial"})Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemVeiculoPessoaJurdica :: new);
    }



    @PutMapping
    @Transactional
    public void atualizar(@RequestBody  @Valid  DadosAtualizacaoClienteJuridico dadosAtualizacaoClienteJuridico){

        var clienteFisico = repository.getReferenceById(dadosAtualizacaoClienteJuridico.id());
        clienteFisico.atualizarInformaces(dadosAtualizacaoClienteJuridico);
    }


    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        var clienteFisico = repository.getReferenceById(id);
        clienteFisico.exclusaoLogica();
    }

}
