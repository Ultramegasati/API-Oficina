package br.com.oficina.domain.cliente.juridico;

import br.com.oficina.domain.endereco.DadosDoEndereco;
import br.com.oficina.domain.veiculo.DadosDoVeiculo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroPessoaJuridica(

         @NotBlank
         String razaoSocial,
         @NotBlank
         String cnpj,
         @NotBlank
         @Email
         String email,
         @NotBlank
         String telefone,
         String telefone1,
         String telefone2,
         @NotNull
         @Valid
         DadosDoEndereco endereco,
         @NotNull
         @Valid
         DadosDoVeiculo veiculo) {
}
