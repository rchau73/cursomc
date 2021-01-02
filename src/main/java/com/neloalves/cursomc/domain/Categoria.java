package com.neloalves.cursomc.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	private String nome;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		
}
