package trabalho;

class Imovel implements Comparable<Imovel>{
	private TipoImovel tipo;
	private Endereco endereco;
	private double area;
	private double preco;
	private Proprietario proprietario;
	
	public Imovel(TipoImovel tipo, Endereco endereco, double area, double preco, Proprietario proprietario) {
		this.tipo = tipo;
		this.endereco = endereco;
		this.area = area;
		this.preco = preco;
		this.proprietario = proprietario;
	}
	
	@Override
	public int compareTo(Imovel o) {
		return this.tipo.getTipo().compareTo(o.tipo.getTipo()); // Compara lexicograficamente
	}

	@Override
	public String toString() {
		return "Imovel tipo " + this.tipo + "\n - Endereco " + this.endereco + ", area " + this.area + ", preco " + this.preco + 
				"\n - " + proprietario;
	}
}
