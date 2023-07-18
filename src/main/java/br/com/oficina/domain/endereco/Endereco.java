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

    public void atualizaInformacoesDoEndereco(DadosDoEndereco dadosDoEndereco) {

        if (dadosDoEndereco.logradouro() != null){
            this.logradouro = dadosDoEndereco.logradouro();
        }

        if (dadosDoEndereco.numero() != null){
            this.numero = dadosDoEndereco.numero();
        }

        if (dadosDoEndereco.complemento() != null){
            this.complemento = dadosDoEndereco.complemento();
        }

        if (dadosDoEndereco.logradouro() != null){
            this.cep = dadosDoEndereco.cep();
        }

        if (dadosDoEndereco.logradouro() != null){
            this.bairro = dadosDoEndereco.bairro();
        }



    }
}
