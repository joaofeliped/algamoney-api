package com.clubee.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clubee.algamoney.api.model.Pessoa;
import com.clubee.algamoney.api.repository.pessoa.PessoaRepositoryQuery;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryQuery {

}
