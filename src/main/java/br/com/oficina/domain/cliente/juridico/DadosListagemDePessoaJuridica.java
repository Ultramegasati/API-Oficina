package br.com.oficina.domain.cliente.juridico;

import br.com.oficina.domain.endereco.Endereco;

public record DadosListagemDePessoaJuridica(

        Long id,
        String razaoSocial,
        String cnpj,
        String telefone,
        String email,
        Endereco endereco

) {

    public DadosListagemDePessoaJuridica(PessoaJuridica pessoaJuridica){

         this(pessoaJuridica.getId(),
                 pessoaJuridica.getRazaoSocial(),
                 pessoaJuridica.getCnpj(),
                 pessoaJuridica.getTelefone(),
                 pessoaJuridica.getEmail(),
                 pessoaJuridica.getEndereco());

    }
}
