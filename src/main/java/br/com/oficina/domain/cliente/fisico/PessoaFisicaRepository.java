package br.com.oficina.domain.cliente.fisico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {
    Page<PessoaFisica> findAllByAtivoTrue(Pageable paginacao);
}
