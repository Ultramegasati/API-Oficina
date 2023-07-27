package br.com.oficina.domain.veiculo;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Embeddable
@Getter            //gerar os getters
@NoArgsConstructor  //gerar construtor sem argumentos
@AllArgsConstructor   //construtor que recebe todos os campos
public class Veiculo {

    private String marca;
    private String modelo;
    private String ano;
    private String motor;
    private String placa;
    private String adicionais;







    public Veiculo(DadosDoVeiculo dadosDoVeiculo){
        this.marca = dadosDoVeiculo.marca();
        this.modelo = dadosDoVeiculo.modelo();
        this.ano = dadosDoVeiculo.ano();
        this.motor = dadosDoVeiculo.motor();
        this.placa = dadosDoVeiculo.placa();
        this.adicionais = dadosDoVeiculo.adicionais();

    }

}
