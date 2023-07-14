package br.com.oficina.controller;



import br.com.oficina.domain.cliente.juridico.DadosCadastroPessoaJuridica;
import br.com.oficina.domain.cliente.juridico.PessoaJuridica;
import br.com.oficina.domain.cliente.juridico.PessoaJuridicaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
