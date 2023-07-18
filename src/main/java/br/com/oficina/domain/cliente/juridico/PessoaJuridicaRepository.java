package br.com.oficina.domain.cliente.juridico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {
    Page<PessoaJuridica> findAllByAtivoTrue(Pageable paginacao);


}
