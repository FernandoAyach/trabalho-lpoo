package trabalho;

import java.util.Scanner;

abstract class Pessoa implements Verificavel {
	private String nome; 
	private String cpf; 
	private String rg; 
	private Endereco endereco;
	private String celular; 
	private String dataNascimento;
	
	public Pessoa(String nome, String cpf, String rg, Endereco endereco, String celular, String dataNascimento) {
		this.nome = nome;
		this.rg = rg;
		this.endereco = endereco;
		this.celular = celular;
		this.dataNascimento = dataNascimento;
		
		//Atribui o cpf se for válido, caso contrário pede outro
		if(validar(cpf)) this.cpf = cpf;
		else solicitarNovo();
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public boolean validar(String codigo) {
		CpfCnpjValidator validator = new CpfCnpjValidator();
		return validator.isValid(codigo);
	}
	
	@Override
	public void solicitarNovo() {
		Scanner sc = new Scanner(System.in);
		String codigo;
		
		do {
			System.out.println(getNome() + " - Insira novamente o CPF/CNPJ:");
			codigo = sc.next();
		} while(!validar(codigo));
		
		this.cpf = codigo;
	}

	@Override
	public String toString() {
		return nome + ", CPF: " + cpf + ", RG: " + rg + 
		", celular: " + celular + ", data de nascimento: " + dataNascimento + "\n - Endereço: " + endereco;
	} 	
}
