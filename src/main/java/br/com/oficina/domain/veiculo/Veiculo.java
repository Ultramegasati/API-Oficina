package br.com.oficina.domain.veiculo;

public class Veiculo {

    private String marca;
    private String modelo;
    private String ano;
    private String motor;
    private String placa;
    private String complemento;







    public Veiculo(DadosDoVeiculo dadosDoVeiculo){
        this.marca = dadosDoVeiculo.marca();
        this.modelo = dadosDoVeiculo.modelo();
        this.ano = dadosDoVeiculo.ano();
        this.motor = dadosDoVeiculo.motor();
        this.placa = dadosDoVeiculo.placa();
        this.complemento = dadosDoVeiculo.complemento();

    }

}
