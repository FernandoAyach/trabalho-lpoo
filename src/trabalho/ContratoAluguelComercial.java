package trabalho;

class ContratoAluguelComercial <T> extends ContratoAluguel<T> {
	private String razaoSocial;
	private String cnpj;

	public  ContratoAluguelComercial  (
		Imovel imovel, Corretor corretor, Cliente cliente, T tempo, double valor, String razaoSocial, String cnpj
	) {
		super(imovel, corretor, cliente, tempo, valor);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Contrato Aluguel Comercial " + super.toString() + ", razaoSocial " + razaoSocial + ", cnpj " + cnpj;
	}

}
