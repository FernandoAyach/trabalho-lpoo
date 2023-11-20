package trabalho;

class Endereco {
	private String rua;
	private String bairro;
	private String cidade;
	private String cep;
	
	public Endereco(String rua, String bairro, String cidade, String cep) {
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
	}
	
	public Endereco(String rua, String bairro, String cidade) {
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "rua: " + rua + ", bairro" + bairro + ", cidade: " + cidade + ", cep: " + cep;
	}
}
