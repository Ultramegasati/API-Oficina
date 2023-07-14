package br.com.oficina.domain.cliente.fisico;

import br.com.oficina.domain.endereco.DadosDoEndereco;
import br.com.oficina.domain.veiculo.DadosDoVeiculo;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record DadosCadastroPessoaFisica(


        @NotBlank     //verifica se não esta vazio e nulo
        String nome,

        @NotBlank
        String cpf,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String telefone,
        String telefone1,
        String telefone2,
        @NotNull
        @Valid   //informando que é um bean e te que validar os campos dele
        DadosDoEndereco endereco,
        @NotNull
        @Valid   //informando que é um bean e te que validar os campos dele
        DadosDoVeiculo veiculo) {
}
