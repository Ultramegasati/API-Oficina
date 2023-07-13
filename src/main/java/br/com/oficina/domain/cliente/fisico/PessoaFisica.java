package br.com.oficina.domain.cliente.fisico;

import br.com.oficina.domain.endereco.Endereco;
import br.com.oficina.domain.veiculo.Veiculo;

public class PessoaFisica {

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    private Endereco endereco;
    private Veiculo veiculo;



    public PessoaFisica(DadosCadastroPessoaFisica dados){

        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.endereco = new Endereco(dados.endereco());
        this.veiculo = new Veiculo(dados.veiculo());

    }


}
