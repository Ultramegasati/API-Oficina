package br.com.oficina.domain.cliente.fisico;

import br.com.oficina.domain.endereco.DadosDoEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoClienteFisico(
        @NotNull
        Long id,
        String nome,
        String email,
        String telefone,
        String telefone1,
        String telefone2,
        DadosDoEndereco endereco) {
}
