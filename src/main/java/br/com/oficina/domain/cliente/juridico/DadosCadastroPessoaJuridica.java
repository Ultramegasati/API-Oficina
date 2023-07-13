package br.com.oficina.domain.cliente.juridico;

import br.com.oficina.domain.endereco.DadosDoEndereco;
import br.com.oficina.domain.veiculo.DadosDoVeiculo;

public record DadosCadastroPessoaJuridica(
         String razaoSocial,
         String cnpj,
         String email,
         DadosDoEndereco endereco,
         DadosDoVeiculo veiculo) {
}
