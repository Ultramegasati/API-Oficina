package br.com.oficina.domain.cliente.juridico;


import br.com.oficina.domain.endereco.Endereco;
import br.com.oficina.domain.veiculo.Veiculo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "pessoa_juridica")
@Entity(name = "PessoaJuridica")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class PessoaJuridica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "razaosocial")
    private String razaoSocial;
    private String cnpj;
    private String email;
    private String telefone;
    private String telefone1;
    private String telefone2;
    private Boolean ativo;

    private Endereco endereco;
    private Veiculo veiculo;







    public PessoaJuridica(DadosCadastroPessoaJuridica dadosCadastroPessoaJuridica){
        this.ativo = true;
        this.razaoSocial = dadosCadastroPessoaJuridica.razaoSocial();
        this.cnpj = dadosCadastroPessoaJuridica.cnpj();
        this.telefone = dadosCadastroPessoaJuridica.telefone();
        this.telefone1 = dadosCadastroPessoaJuridica.telefone1();
        this.telefone2 = dadosCadastroPessoaJuridica.telefone2();
        this.email = dadosCadastroPessoaJuridica.email();
        this.endereco = new Endereco(dadosCadastroPessoaJuridica.endereco());
        this.veiculo = new Veiculo(dadosCadastroPessoaJuridica.veiculo());

    }


    public void atualizarInformaces(DadosAtualizacaoClienteJuridico dadosAtualizacaoClienteJuridico) {
        if (dadosAtualizacaoClienteJuridico.razaoSocial() != null){
            this.razaoSocial = dadosAtualizacaoClienteJuridico.razaoSocial();
        }

        if (dadosAtualizacaoClienteJuridico.email() != null){
            this.email = dadosAtualizacaoClienteJuridico.email();
        }

        if (dadosAtualizacaoClienteJuridico.telefone() != null){
            this.telefone = dadosAtualizacaoClienteJuridico.telefone();
        }

        if (dadosAtualizacaoClienteJuridico.telefone1() != null){
            this.telefone1 = dadosAtualizacaoClienteJuridico.telefone1();
        }

        if (dadosAtualizacaoClienteJuridico.telefone2() != null){
            this.telefone2 = dadosAtualizacaoClienteJuridico.telefone2();
        }

        if (dadosAtualizacaoClienteJuridico.endereco() != null){
            this.endereco.atualizaInformacoesDoEndereco(dadosAtualizacaoClienteJuridico.endereco());
        }
    }

    public void exclusaoLogica() {
        this.ativo = false;
    }
}
