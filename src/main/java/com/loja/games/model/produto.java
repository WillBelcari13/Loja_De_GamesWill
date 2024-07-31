package com.loja.games.model;

import javax.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.math.BigDecimal;

@Entity
public class produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private BigDecimal preco;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private categoria categoria;

	public Object getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getDescricao() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPreco() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNome(Object nome2) {
		// TODO Auto-generated method stub
		
	}

	public void setDescricao(Object descricao2) {
		// TODO Auto-generated method stub
		
	}

	public void setPreco(Object preco2) {
		// TODO Auto-generated method stub
		
	}

    // Getters e Setters
}

