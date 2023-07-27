package br.com.oficina.controller;

import br.com.oficina.domain.cliente.fisico.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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





//    @GetMapping // apenas fazendo leitura de todo o bd
//    public List<DadosListagemDePessoaFisica> listar(){
//
//        //convertendo lista de DadosListagemDePessoaFisica para PessoaFisica
//        return repository.findAll().stream().map(DadosListagemDePessoaFisica :: new).toList();
//    }


    @GetMapping // apenas fazendo leitura do bd
    public Page<DadosListagemDePessoaFisica> listar(@PageableDefault(size = 10,sort = {"nome"}) Pageable paginacao){
        //(@PageableDefault(size = 10,sort = {"nome"}) carregando 10 registro e ordenando pelo nome


        //convertendo lista de DadosListagemDePessoaFisica para PessoaFisica
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemDePessoaFisica :: new);

    }


//    @GetMapping("/listarVeiculo")  //trazendo todos registrosdo bd
//    public List<DadosListagemVeiculoPessoaFisica> listarVeiculo(){
//        return repository.findAll().stream().map(DadosListagemVeiculoPessoaFisica :: new).toList();
//    }


    @GetMapping("listarLogicosExcluidos")
    public Page listarClienteFisicosExcluidosLogicos(@PageableDefault(size = 10,sort = {"nome"})Pageable paginacao){
        return repository.findAllByAtivoFalse(paginacao).map(DadosListagemDePessoaFisica::new);
    }


    @GetMapping("/listarVeiculo")  //paginação
    public Page<DadosListagemVeiculoPessoaFisica> listarVeiculo(@PageableDefault(size = 10,sort = {"nome"})Pageable paginacao){
            return repository.findAllByAtivoTrue(paginacao).map(DadosListagemVeiculoPessoaFisica :: new);


            //trazendo todos, ativos e inativos
        //        return repository.findAll(paginacao).map(DadosListagemVeiculoPessoaFisica :: new);
    }





    @PostMapping("/buscaPorNome")
    public List listarClienteFisicoPorNome(@RequestBody  DadosListagemPorNomeDePessoaFisica dados){
        //return  repository.findAllByNomeStartingWithOrderByNome(dados.nome());
        return repository.searchByNomeStartingWithOrderByNome(dados.nome());

    }

    @PostMapping("/buscaPorPlaca")
    public List listarClienteFisicoPorPlaca(@RequestBody DadosPesquisaPorPlacaDePessoaFisica dados){

        return repository.findByVeiculo_Placa(dados.placa());

    }







    @PutMapping
    @Transactional
    public void atualizar(@RequestBody   @Valid DadosAtualizacaoClienteFisico dadosAtualizacaoClienteFisico){

        var clienteFisico = repository.getReferenceById(dadosAtualizacaoClienteFisico.id());
        clienteFisico.atualizarInfromacoes(dadosAtualizacaoClienteFisico);

    }


    //exclusão lógica, foi criado no bd coluna ativo
    //passando id na url
    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable  Long id){
        var clienteFisico = repository.getReferenceById(id);
        clienteFisico.excluir();

    }
}
