package br.com.oficina.domain.cliente.fisico;


import br.com.oficina.domain.endereco.Endereco;

//Dados que serão devolvidos
public record DadosListagemDePessoaFisica(

        Long id,
        String nome,
        String email,
        String telefone,
        String telefone1,
        String telefone2,
        Endereco endereco

) {

    public DadosListagemDePessoaFisica(PessoaFisica pessoaFisica) {
        this(pessoaFisica.getId(),
                pessoaFisica.getNome(),
                pessoaFisica.getEmail(),
                pessoaFisica.getTelefone(),
                pessoaFisica.getTelefone1(),
                pessoaFisica.getTelefone2(),
                pessoaFisica.getEndereco());
    }
}
