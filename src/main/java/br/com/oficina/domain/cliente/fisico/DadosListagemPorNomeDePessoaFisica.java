package br.com.oficina.domain.cliente.fisico;

import br.com.oficina.domain.endereco.Endereco;
import br.com.oficina.domain.veiculo.Veiculo;


public record DadosListagemPorNomeDePessoaFisica(
        Long id,
        String nome,
        String email,
        String telefone,
        Endereco endereco,
        Veiculo veiculo) {

}
