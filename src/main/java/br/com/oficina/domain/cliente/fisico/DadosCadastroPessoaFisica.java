package br.com.oficina.domain.cliente.fisico;

import br.com.oficina.domain.endereco.DadosDoEndereco;
import br.com.oficina.domain.veiculo.DadosDoVeiculo;


public record DadosCadastroPessoaFisica(

         String nome,
         String cpf,
         String email,
         String telefone,
         DadosDoEndereco endereco,
         DadosDoVeiculo veiculo) {
}
