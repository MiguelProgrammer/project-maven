package br.estudandoemcasa.maven.domain;

import java.math.BigDecimal;

public class Produto {
	
	private String nome;
	private BigDecimal valor;
	
	public Produto(String nome, BigDecimal valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
