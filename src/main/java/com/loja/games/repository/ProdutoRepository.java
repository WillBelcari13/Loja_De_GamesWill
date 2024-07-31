package com.loja.games.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.loja.games.model.produto;

public interface ProdutoRepository extends JpaRepository<produto, Long> {
}
