package trabalho;

class Corretor extends Pessoa {
	private String creci;

	public Corretor(
		String nome, String cpf, String rg, String celular, String dataNascimento, Endereco endereco, String creci
	) {
		super(nome, cpf, rg, celular, dataNascimento, endereco);
		this.creci = creci;
	}

	@Override
	public String toString() {
		return "Corretor " + super.toString() + ", creci: " + this.creci;
	}
}
