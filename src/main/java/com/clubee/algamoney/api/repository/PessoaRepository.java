package com.clubee.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clubee.algamoney.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
