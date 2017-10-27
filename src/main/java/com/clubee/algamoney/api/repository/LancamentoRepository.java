package com.clubee.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clubee.algamoney.api.model.Lancamento;
import com.clubee.algamoney.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
