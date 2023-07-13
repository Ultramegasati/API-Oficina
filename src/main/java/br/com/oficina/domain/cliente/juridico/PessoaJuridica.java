package br.com.oficina.domain.cliente.juridico;


import br.com.oficina.domain.endereco.Endereco;
import br.com.oficina.domain.veiculo.Veiculo;

public class PessoaJuridica {

    private Long id;
    private String razaoSocial;
    private String cnpj;
    private String email;
    private Endereco endereco;
    private Veiculo veiculo;







    public PessoaJuridica(DadosCadastroPessoaJuridica dadosCadastroPessoaJuridica){
        this.razaoSocial = dadosCadastroPessoaJuridica.razaoSocial();
        this.cnpj = dadosCadastroPessoaJuridica.cnpj();
        this.email = dadosCadastroPessoaJuridica.email();
        this.endereco = new Endereco(dadosCadastroPessoaJuridica.endereco());
        this.veiculo = new Veiculo(dadosCadastroPessoaJuridica.veiculo());

    }


}
