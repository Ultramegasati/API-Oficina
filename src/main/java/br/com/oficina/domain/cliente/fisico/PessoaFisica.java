package br.com.oficina.domain.cliente.fisico;

import br.com.oficina.domain.endereco.Endereco;
import br.com.oficina.domain.veiculo.Veiculo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "pessoa_fisica")
@Entity(name = "PessoaFisica")
@Getter            //gerar os getters
@NoArgsConstructor  //gerar construtor sem argumentos
@AllArgsConstructor   //construtor que recebe todos os campos
@EqualsAndHashCode(of = "id")  //gerar equal e hashcode somentedo id
public class PessoaFisica {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String telefone1;
    private String telefone2;

    private Endereco endereco;
    private Veiculo veiculo;



    public PessoaFisica(DadosCadastroPessoaFisica dados){

        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.telefone1 = dados.telefone1();
        this.telefone2 = dados.telefone2();
        this.endereco = new Endereco(dados.endereco());
        this.veiculo = new Veiculo(dados.veiculo());

    }


}
