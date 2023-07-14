package br.com.oficina.domain.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter            //gerar os getters
@NoArgsConstructor  //gerar construtor sem argumentos
@AllArgsConstructor   //construtor que recebe todos os campos
public class Endereco {

    private String logradouro;
    private String numero;
    private String complemento;
    private String cep;
    private String bairro;



    public Endereco(DadosDoEndereco dados){
        this.logradouro = dados.logradouro();
        this.numero = dados.numero();
        this.complemento = dados.complemento();
        this.cep = dados.cep();
        this.bairro = dados.bairro();
    }
}
