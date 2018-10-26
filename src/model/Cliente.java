package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Cliente extends DefaultEntity<Cliente> {

	private static final long serialVersionUID = 8672288647132003282L;

	private String profissao;

	@OneToOne(cascade=CascadeType.ALL)//associacao de clinte  e pessoa de 1 para 1
	@JoinColumn(name="idpessoa", unique=true)//nome da coluna  e dizendo que vai ser unico
	private Pessoa pessoa;
	
	@ManyToMany
	@JoinTable(name="ClienteProduto", 
			joinColumns=  @JoinColumn(name="idcliente"),
			inverseJoinColumns= @JoinColumn(name="idproduto") )
	private List<Produto> listaDesejo;
	

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Produto> getListaDesejo() {
		return listaDesejo;
	}

	public void setListaDesejo(List<Produto> listaDesejo) {
		this.listaDesejo = listaDesejo;
	}

}
