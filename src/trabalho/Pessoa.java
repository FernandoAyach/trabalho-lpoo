package trabalho;

import java.util.Scanner;

abstract class Pessoa implements Verificavel {
	private String nome; 
	private String cpf; 
	private String rg; 
	private String celular; 
	protected String dataNascimento;
	private Endereco endereco;
	
	public Pessoa(String nome, String cpf, String rg, String celular, String dataNascimento, Endereco endereco) {
		this.nome = nome;
		this.rg = rg;
		this.celular = celular;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		
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
		", celular: " + celular + ", data de nascimento: " + dataNascimento + "\nEndereço: " + endereco;
	} 	
}
