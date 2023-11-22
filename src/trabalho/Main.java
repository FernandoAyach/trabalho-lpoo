package trabalho;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Endereco> enderecos = new ArrayList<Endereco>();
		ArrayList<TipoImovel> tiposImoveis = new ArrayList<TipoImovel>();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Proprietario> proprietarios = new ArrayList<Proprietario>();
		ArrayList<Corretor> corretores = new ArrayList<Corretor>();
		ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
		ArrayList<ContratoAluguel> contratosAluguel = new ArrayList<ContratoAluguel>();
		ArrayList<ContratoAluguelComercial> contratosCoAluguel = new ArrayList<ContratoAluguelComercial>();
		
		ArrayList<Imovel> imoveisDispo = new ArrayList<Imovel>();
		ArrayList<Imovel> imoveisMan = new ArrayList<Imovel>();
		
		//12 enderecos
		enderecos.add(new Endereco("Av. Paulista", "Bela Vista", "São Paulo", "01310-100"));
		enderecos.add(new Endereco("Rua das Flores", "Centro", "Rio de Janeiro", "20000-001"));
		enderecos.add(new Endereco("Av. Beira Mar", "Praia de Iracema", "Fortaleza", "60000-000"));
		enderecos.add(new Endereco("Rua das Palmeiras", "Jardim Botânico", "Curitiba", "80210-040"));
		enderecos.add(new Endereco("Av. Boa Viagem", "Boa Viagem", "Recife", "50000-000"));
		enderecos.add(new Endereco("Rua do Comércio", "Centro", "Salvador", "40010-020"));
		enderecos.add(new Endereco("Av. Floriano Peixoto", "Centro", "Maceió", "57000-000"));
		enderecos.add(new Endereco("Rua das Acácias", "Jardim das Flores", "Belo Horizonte", "30123-456"));
		enderecos.add(new Endereco("Av. das Dunas", "Praia do Forte", "Natal", "59000-123"));
		enderecos.add(new Endereco("Rua da Liberdade", "Libertyville", "Porto Alegre", "90000-789"));
		enderecos.add(new Endereco("Av. dos Ipês", "Parque das Árvores", "Campo Grande", "79000-456"));
		enderecos.add(new Endereco("Rua dos Girassóis", "Jardim Primavera", "Cuiabá", "78000-987"));
		
		//4 tipos de imoveis
		tiposImoveis.add(new TipoImovel("terreno"));
		tiposImoveis.add(new TipoImovel("casa"));
		tiposImoveis.add(new TipoImovel("apartamento"));
		tiposImoveis.add(new TipoImovel("comercio"));
		
		//4 clientes
		clientes.add(
			new Cliente("Alberto Renato", "123.456.789-09", "1234567-8", "(67) 98765-4321", "12/01/1980", enderecos.get(0), 50)
		);
		clientes.add(
			new Cliente("Javier Milei", "529.982.247-25", "3456789-0", "(67) 91234-5678","20/11/1960", enderecos.get(1), 100)
		);
		clientes.add(
			new Cliente("Severino de Maria", "012.345.678-90", "9876543-2", "(67) 99876-5432", "15/05/1920", enderecos.get(2), 150)
		);
		clientes.add(
			new Cliente("Claudete Silva", "738.622.080-44", "8765432-1", "(67) 92345-6789", "11/09/1999", enderecos.get(3), 200)
		);
		
		//6 proprietarios
		proprietarios.add(
			new Proprietario("José Oliveira", "854.545.250-06", "1234567-8",
			"(11) 98765-4321", "01/01/1980", enderecos.get(4), "jose.oliveira@pix.com")
		);
		proprietarios.add(
			new Proprietario("Mariana Dávila", "805.664.670-11", "9876543-2",
		    "(21) 99876-5432", "15/05/1995", enderecos.get(5), "mariana.pix@banco.com")
		);
		proprietarios.add(
	        new Proprietario("Roberto Justus", "371.167.500-02", "3456789-0",
	        "(31) 91234-5678", "22/11/1975", enderecos.get(0), "roberto_pix@pixmail.com")
	    );
	    proprietarios.add(
	        new Proprietario("Camila Alencar", "973.410.950-24", "8765432-1",
	        "(41) 92345-6789", "10/09/1988", enderecos.get(1), "camila123@banco.com")
	    );
	    proprietarios.add(
	        new Proprietario("Lucas Mendes", "938.673.360-91", "9876543-21",
	        "(51) 98765-4321", "12/03/1990", enderecos.get(2), "lucas.mendes@pix.com")
	    );
	    proprietarios.add(
	        new Proprietario("Aline Robertina", "394.145.140-58", "1234567-89",
	        "(61) 98765-4321", "05/07/1985", enderecos.get(3), "aline_pix@banco.com")
	    );
	    
		//3 corretores
	    corretores.add(
	        new Corretor("Fernanda Lima", "966.718.030-13", "1234567-8",
	        "(11) 98765-4321", "01/01/1980", enderecos.get(4), "CRECI12345")
	    );
	    corretores.add(
	       new Corretor("Batista LePerin", "493.573.190-77", "9876543-2",
	       "(21) 99876-5432", "15/05/1995", enderecos.get(5), "CRECI54321")
	    );
	    corretores.add(
	       new Corretor("Mariano Costa", "651.160.000-95", "3456789-0",
	       "(31) 91234-5678", "22/11/1975", enderecos.get(0), "CRECI67890")
	    );
	    
		//6 imoveis
	    imoveis.add(new Imovel(tiposImoveis.get(0), 80.5, 250000.0, proprietarios.get(0), enderecos.get(6)));
	    imoveis.add(new Imovel(tiposImoveis.get(0), 120.0, 350000.0, proprietarios.get(1), enderecos.get(7)));
	    imoveis.add(new Imovel(tiposImoveis.get(1), 500.0, 120000.0, proprietarios.get(2), enderecos.get(8)));
	    imoveis.add(new Imovel(tiposImoveis.get(2), 65.0, 200000.0, proprietarios.get(3), enderecos.get(9)));
	    imoveis.add(new Imovel(tiposImoveis.get(3), 150.0, 450000.0, proprietarios.get(4), enderecos.get(10)));
	    imoveis.add(new Imovel(tiposImoveis.get(2), 800.0, 180000.0, proprietarios.get(5), enderecos.get(11)));
	
		//2 contrato aluguel
	    contratosAluguel.add(new ContratoAluguel(imoveis.get(0), corretores.get(0), clientes.get(0), "2 anos" , 100000.0));
	    contratosAluguel.add(new ContratoAluguel(imoveis.get(1), corretores.get(1), clientes.get(1), "10 anos" , 200000.0));
	    
		//1 contrato aluguel comercial
	    contratosCoAluguel.add(
	    	new ContratoAluguelComercial(
	    		imoveis.get(2), corretores.get(2), clientes.get(2), "5 anos" , 200000.0, "Empresa FRA Ltda.", "12.345.678/0001-90"
	    	)
	    );
	    
	    // Imoveis disponiveis e em manutenção
	    imoveisDispo.add(imoveis.get(3));
	    imoveisDispo.add(imoveis.get(4));
	    Collections.sort(imoveisDispo);
	    imoveisMan.add(imoveis.get(5));
	    
	    //Output
	    for(Cliente cliente : clientes) System.out.println(cliente);
	    for(Corretor corretor : corretores) System.out.println(corretor);
	    for(Proprietario proprietario : proprietarios) System.out.println(proprietario);
	    for(ContratoAluguel contratoAluguel : contratosAluguel) System.out.println(contratoAluguel);
	    for(ContratoAluguelComercial contratoCoAluguel : contratosCoAluguel) System.out.println(contratoCoAluguel);
	    for(Imovel imovel : imoveisDispo) System.out.println(imovel);
	    for(Imovel imovel : imoveisMan) System.out.println(imovel);
	}
}