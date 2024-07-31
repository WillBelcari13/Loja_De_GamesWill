package com.loja.games.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.loja.games.model.categoria;

public interface CategoriaRepository extends JpaRepository<categoria, Long> {
}
