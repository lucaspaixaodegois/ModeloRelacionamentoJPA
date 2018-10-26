package model;

import javax.persistence.Entity;

@Entity
public class PessoaFisica extends Pessoa {

	private static final long serialVersionUID = -3140101927239068385L;
	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


}
