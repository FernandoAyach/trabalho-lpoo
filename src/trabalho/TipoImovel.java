package trabalho;

class TipoImovel {
	private String tipo; // terreno, casa, apartamento, comercio
	
	public String getTipo() {
		return tipo;
	}

	public TipoImovel(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return tipo;
	}
}
