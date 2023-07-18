package br.com.oficina.domain.cliente.fisico;

import br.com.oficina.domain.veiculo.Veiculo;

public record DadosListagemVeiculoPessoaFisica(Long id,String nome, Veiculo veiculo) {

    public DadosListagemVeiculoPessoaFisica (PessoaFisica pessoaFisica){
        this(pessoaFisica.getId(), pessoaFisica.getNome(), pessoaFisica.getVeiculo());
    }
}
