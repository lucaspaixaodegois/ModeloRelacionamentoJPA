package model;

import javax.persistence.Entity;

@Entity
public class Endereco extends DefaultEntity<Endereco> {

	private static final long serialVersionUID = 1522120373005589042L;

	private String numero;

	private String logradrouro;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getLogradrouro() {
		return logradrouro;
	}

	public void setLogradrouro(String logradrouro) {
		this.logradrouro = logradrouro;
	}

	public Cep getCep() {
		return cep;
	}

	public void setCep(Cep cep) {
		this.cep = cep;
	}

	private Cep cep;

}
