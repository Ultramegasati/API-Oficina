package br.com.oficina.domain.endereco;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosDoEndereco(

     @NotBlank
     String logradouro,
     String numero,
     String complemento,
     @NotBlank
     @Pattern(regexp = "\\d{8}")    // definindo que serão 8 digitos
     String cep,
     String bairro){

}


