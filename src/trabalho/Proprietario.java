package trabalho;

class Proprietario extends Pessoa {
	private String pix;

	public Proprietario(
		String nome, String cpf, String rg, String celular, String dataNascimento, Endereco endereco, String pix
	) {
		super(nome, cpf, rg, celular, dataNascimento, endereco);
		this.pix = pix;
	}

	@Override
	public String toString() {
		return "Proprietario " + super.toString()  + ", pix: " + pix;
	}
}
