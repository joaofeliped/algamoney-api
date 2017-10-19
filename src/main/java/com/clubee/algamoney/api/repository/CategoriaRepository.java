package com.clubee.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clubee.algamoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
