package model;

import javax.persistence.Entity;

@Entity
public class Produto extends DefaultEntity<Produto> {

	private static final long serialVersionUID = 4239910517455560953L;

	private String nome;

	private double preco;

	private Fornecedor fornecedor;	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

}
