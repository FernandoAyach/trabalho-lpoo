package trabalho;

class Cliente extends Pessoa {
	private int pontuacao;

	public Cliente(
		String nome, String cpf, String rg, String celular, String dataNascimento, Endereco endereco, int pontuacao
	) {
		super(nome, cpf, rg, celular, dataNascimento, endereco);
		this.pontuacao = pontuacao;
	}

	@Override
	public String toString() {
		return "Cliente " + super.toString() + " pontuação: " + this.pontuacao;
	}
}
