package trabalho;

class ContratoAluguel <T> {
	
	private Imovel imovel;
	private Corretor corretor;
	private Cliente cliente;
	private T tempo;
	private double valor;

	public ContratoAluguel(Imovel imovel, Corretor corretor, Cliente cliente, T tempo, double valor) {
		this.imovel = imovel;
		this.corretor = corretor;
		this.cliente = cliente;
		this.tempo = tempo;
		this.valor = valor;
	}
	
	public double calcularComissao() {
		return (0.1 * this.valor);
	}

	@Override
	public String toString() {
		return "ContratoAluguel imovel " + this.imovel + 
				", corretor " + this.corretor + 
				", cliente " + this.cliente + 
				", tempo " + this.tempo + ", valor " + this.valor;
	}
}
