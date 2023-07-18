package br.com.oficina.domain.cliente.juridico;

import br.com.oficina.domain.endereco.DadosDoEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoClienteJuridico(
        @NotNull
        Long id,
        String razaoSocial,
        String email,
        String telefone,
        String telefone1,
        String telefone2,
        DadosDoEndereco endereco) {
}
