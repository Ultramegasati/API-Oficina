package br.com.oficina.domain.cliente.fisico;


import br.com.oficina.domain.endereco.Endereco;

//Dados que serão devolvidos
public record DadosListagemDePessoaFisica(

        Long id,
        String nome,
        String email,
        String telefone,
        Endereco endereco

) {

    public DadosListagemDePessoaFisica(PessoaFisica pessoaFisica) {
        this(pessoaFisica.getId(), pessoaFisica.getNome(), pessoaFisica.getEmail(), pessoaFisica.getTelefone(), pessoaFisica.getEndereco());
    }
}
