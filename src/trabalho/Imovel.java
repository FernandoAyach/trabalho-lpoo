package trabalho;

class Imovel implements Comparable<Imovel>{
	
	private TipoImovel tipo;
	private Endereco endereco;
	private double area;
	private double preco;
	private Proprietario proprietario;
	
	public Imovel(TipoImovel tipo, double area, double preco, Proprietario proprietario, Endereco endereco) {
		this.tipo = tipo;
		this.area = area;
		this.preco = preco;
		this.proprietario = proprietario;
		this.endereco = endereco;
	}
	
	@Override
	public int compareTo(Imovel o) {
		return this.tipo.getTipo().compareTo(o.tipo.getTipo());
	}

	@Override
	public String toString() {
		return "Imovel tipo" + this.tipo + ", endereco " + this.endereco + ", area " + this.area + ", preco " + this.preco + 
				", proprietario " + proprietario;
	}
}
