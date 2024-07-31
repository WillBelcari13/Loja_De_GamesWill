package com.loja.games.model;

import javax.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "categoria")
    private List<produto> produtos;

	public Object getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNome(Object nome2) {
		// TODO Auto-generated method stub
		
	}

    // Getters e Setters
}

