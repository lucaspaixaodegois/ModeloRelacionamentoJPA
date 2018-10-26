# Relacionamentos JPA

## Lista dos tipos de anotações de relacionamentos

+ @Inheritance(strategy=InheritanceType.JOINED)

	Pode ser observada nos relacionamentos entre as classes:
		
		1) Pessoa -> {PessoaFisica, PessoaJuridica}

+ @OneToMany

	Pode ser observada nos relacionamentos entre as classes:
	
		1) "Pessoa -> Telefone"
		2) "Venda  -> ItemVenda"
	
+ @ManyToOne

	Pode ser observada nos relacionamentos entre as classes:
	
		1) "Telefone -> Pessoa"
		2) "Endereco -> Estado"
		3) "Cep -> Municipio"		
		4) "Municipio -> Estado"
		5) "Venda -> Cliente"
		6) "Venda -> Funcionario"
		7) "ItemVenda -> Produto"
	
+ @OneToOne

	Pode ser observada nos relacionamentos entre as classes:
	
		1) "Pessoa -> Endereco"
		2) "Cliente -> Pessoa"
		3) "Funcionario -> PessoaFisica"
		4) "Fornecedor -> PessoaJuridica"
	
+ @ManyToMany

	Pode ser observada no relacionamento entre as classes:
	
		1) "Cliente -> Produto"
