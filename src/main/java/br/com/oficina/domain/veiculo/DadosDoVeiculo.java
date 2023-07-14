package br.com.oficina.domain.veiculo;

import jakarta.validation.constraints.NotBlank;

public record DadosDoVeiculo(
         @NotBlank
         String marca,
         @NotBlank
         String modelo,
         @NotBlank
         String ano,
         @NotBlank
         String motor,
         @NotBlank
         String placa,
         String adicionais) {
}
