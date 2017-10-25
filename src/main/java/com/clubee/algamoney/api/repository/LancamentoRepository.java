package com.clubee.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clubee.algamoney.api.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
