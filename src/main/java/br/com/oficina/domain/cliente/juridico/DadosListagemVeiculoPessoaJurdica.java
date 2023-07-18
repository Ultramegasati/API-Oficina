package br.com.oficina.domain.cliente.juridico;

import br.com.oficina.domain.veiculo.Veiculo;

public record DadosListagemVeiculoPessoaJurdica(Long id, String razaoSocial, Veiculo veiculo) {

    public DadosListagemVeiculoPessoaJurdica(PessoaJuridica pessoaJuridica){
        this(pessoaJuridica.getId(), pessoaJuridica.getRazaoSocial(), pessoaJuridica.getVeiculo());
    }
}
