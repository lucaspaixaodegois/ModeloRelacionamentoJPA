package model;

import javax.persistence.Entity;

@Entity
public class PessoaJuridica extends Pessoa {

	private static final long serialVersionUID = -694893166516080008L;
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
