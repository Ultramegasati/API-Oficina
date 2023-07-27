package br.com.oficina.domain.cliente.fisico;




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {
    Page<PessoaFisica> findAllByAtivoTrue(Pageable paginacao);

    Page<PessoaFisica> findAllByAtivoFalse(Pageable paginacao);


   // List<DadosListagemPorNomeDePessoaFisica> findAllByNomeStartingWithOrderByNome(String nome);
List<DadosListagemPorNomeDePessoaFisica> searchByNomeStartingWithOrderByNome(String nome);



    //@Query("select p from PessoaFisica p join p.veiculo v where v.placa =: placa")
   List<DadosListagemVeiculoPessoaFisica> findByVeiculo_Placa(String placa);


//para separar nome entidade do atributo utilizar _
}
