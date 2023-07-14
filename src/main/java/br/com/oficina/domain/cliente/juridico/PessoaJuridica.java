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
    private Endereco endereco;
    private Veiculo veiculo;







    public PessoaJuridica(DadosCadastroPessoaJuridica dadosCadastroPessoaJuridica){
        this.razaoSocial = dadosCadastroPessoaJuridica.razaoSocial();
        this.cnpj = dadosCadastroPessoaJuridica.cnpj();
        this.telefone = dadosCadastroPessoaJuridica.telefone();
        this.telefone1 = dadosCadastroPessoaJuridica.telefone1();
        this.telefone2 = dadosCadastroPessoaJuridica.telefone2();
        this.email = dadosCadastroPessoaJuridica.email();
        this.endereco = new Endereco(dadosCadastroPessoaJuridica.endereco());
        this.veiculo = new Veiculo(dadosCadastroPessoaJuridica.veiculo());

    }


}
