package trabalho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op, p, n;
		
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
		do {
			op = 0;
			//Tratamento de exceção de inteiros: usuário digita a o número do endereço, se for inválido, o erro
			//é capturado e volta ao início do processo.
			try {
				System.out.println("Número endereço 1: ");
				n = sc.nextInt();
				enderecos.add(new Endereco("Av. Paulista", n, "Bela Vista", "São Paulo", "01310-100"));
				
				System.out.println("Número endereço 2: ");
				n = sc.nextInt();
				enderecos.add(new Endereco("Rua das Flores", n, "Centro", "Rio de Janeiro", "20000-001"));
				
				System.out.println("Número endereço 3: ");
				n = sc.nextInt();
				enderecos.add(new Endereco("Av. Beira Mar", n, "Praia de Iracema", "Fortaleza", "60000-000"));
				
				System.out.println("Número endereço 4: ");
				n = sc.nextInt();
				enderecos.add(new Endereco("Rua das Palmeiras", n, "Jardim Botânico", "Curitiba", "80210-040"));
				
				System.out.println("Número endereço 5: ");
				n = sc.nextInt();
				enderecos.add(new Endereco("Av. Boa Viagem", n, "Boa Viagem", "Recife", "50000-000"));
				
				System.out.println("Número endereço 5: ");
				n = sc.nextInt();
				enderecos.add(new Endereco("Rua do Comércio", n, "Centro", "Salvador", "40010-020"));
				
				System.out.println("Número endereço 7: ");
				n = sc.nextInt();
				enderecos.add(new Endereco("Av. Floriano Peixoto", n, "Centro", "Maceió", "57000-000"));
				
				System.out.println("Número endereço 8: ");
				n = sc.nextInt();
				enderecos.add(new Endereco("Rua das Acácias", n, "Jardim das Flores", "Belo Horizonte", "30123-456"));
				
				System.out.println("Número endereço 9: ");
				n = sc.nextInt();
				enderecos.add(new Endereco("Av. das Dunas", n, "Praia do Forte", "Natal", "59000-123"));
				
				System.out.println("Número endereço 10: ");
				n = sc.nextInt();
				enderecos.add(new Endereco("Rua da Liberdade", n, "Libertyville", "Porto Alegre", "90000-789"));
				
				System.out.println("Número endereço 11: ");
				n = sc.nextInt();
				enderecos.add(new Endereco("Av. dos Ipês", n, "Parque das Árvores", "Campo Grande", "79000-456"));
				
				System.out.println("Número endereço 12: ");
				n = sc.nextInt();
				enderecos.add(new Endereco("Rua dos Girassóis", n, "Jardim Primavera", "Cuiabá", "78000-987"));
			} catch(InputMismatchException e) {
				System.out.println("Entrada inválida para inteiros, insira novamente os valores do endereço");
				op = 1;
				sc.nextLine();
			}
		} while(op != 0);
		
		
		//4 tipos de imoveis
		tiposImoveis.add(new TipoImovel("terreno"));
		tiposImoveis.add(new TipoImovel("casa"));
		tiposImoveis.add(new TipoImovel("apartamento"));
		tiposImoveis.add(new TipoImovel("comercio"));
		
		//4 clientes
		do {
			op = 0;
			//Tratamento de exceção de inteiros: usuário digita a pontuação do cliente, se for inválida, o erro
			//é capturado e volta ao início do processo.
			try {
				System.out.println("Pontuação cliente 1: ");
				p = sc.nextInt();
				clientes.add(
						//"123.456.789-09"
					new Cliente("Alberto Fernadez", "a", "1234567-8", enderecos.get(0), "(67) 98765-4321", "12/01/1980", p)
				);
				
				System.out.println("Pontuação cliente 2: ");
				p = sc.nextInt();
				clientes.add(
					new Cliente("Javier Milei", "529.982.247-25", "3456789-0", enderecos.get(1), "(67) 91234-5678","20/11/1960", p)
				);
				
				System.out.println("Pontuação cliente 3: ");
				p = sc.nextInt();
				clientes.add(
					new Cliente("Severino de Maria", "012.345.678-90", "9876543-2", enderecos.get(2), "(67) 99876-5432", "15/05/1920", p)
				);
				
				
				System.out.println("Pontuação cliente 4: ");
				p = sc.nextInt();
				clientes.add(
					new Cliente("Claudete Silva", "738.622.080-44", "8765432-1", enderecos.get(3), "(67) 92345-6789", "11/09/1999", p)
				);
			} catch(InputMismatchException e) {
				System.out.println("Entrada inválida para inteiros, insira novamente os valores do cliente");
				op = 1;
				sc.nextLine();
			}
		} while(op != 0);
		sc.close();
		
		//6 proprietarios
		proprietarios.add(
			new Proprietario("José Oliveira", "854.545.250-06", "1234567-8", enderecos.get(4),
			"(11) 98765-4321", "01/01/1980", "jose.oliveira@pix.com")
		);
		proprietarios.add(
			new Proprietario("Mariana Dávila", "805.664.670-11", "9876543-2", enderecos.get(5),
		    "(21) 99876-5432", "15/05/1995", "mariana.pix@banco.com")
		);
		proprietarios.add(
	        new Proprietario("Roberto Justus", "371.167.500-02", "3456789-0", enderecos.get(0),
	        "(31) 91234-5678", "22/11/1975", "roberto_pix@pixmail.com")
	    );
	    proprietarios.add(
	        new Proprietario("Camila Alencar", "973.410.950-24", "8765432-1", enderecos.get(1),
	        "(41) 92345-6789", "10/09/1988", "camila123@banco.com")
	    );
	    proprietarios.add(
	        new Proprietario("Lucas Mendes", "938.673.360-91", "9876543-21", enderecos.get(2),
	        "(51) 98765-4321", "12/03/1990", "lucas.mendes@pix.com")
	    );
	    proprietarios.add(
	        new Proprietario("Aline Robertina", "394.145.140-58", "1234567-89", enderecos.get(3),
	        "(61) 98765-4321", "05/07/1985", "aline_pix@banco.com")
	    );
	    
		//3 corretores
	    corretores.add(
	        new Corretor("Fernanda Lima", "966.718.030-13", "1234567-8", enderecos.get(4),
	        "(11) 98765-4321", "01/01/1980", "CRECI12345")
	    );
	    corretores.add(
	       new Corretor("Batista LePerin", "493.573.190-77", "9876543-2", enderecos.get(5),
	       "(21) 99876-5432", "15/05/1995", "CRECI54321")
	    );
	    corretores.add(
	       new Corretor("Mariano Costa", "651.160.000-95", "3456789-0", enderecos.get(0),
	       "(31) 91234-5678", "22/11/1975", "CRECI67890")
	    );
	    
		//6 imoveis
	    imoveis.add(new Imovel(tiposImoveis.get(0), enderecos.get(6), 80.5, 250000.0, proprietarios.get(0)));
	    imoveis.add(new Imovel(tiposImoveis.get(0), enderecos.get(7), 120.0, 350000.0, proprietarios.get(1)));
	    imoveis.add(new Imovel(tiposImoveis.get(1), enderecos.get(8), 500.0, 120000.0, proprietarios.get(2)));
	    imoveis.add(new Imovel(tiposImoveis.get(2), enderecos.get(9), 65.0, 200000.0, proprietarios.get(3)));
	    imoveis.add(new Imovel(tiposImoveis.get(3), enderecos.get(10), 150.0, 450000.0, proprietarios.get(4)));
	    imoveis.add(new Imovel(tiposImoveis.get(2), enderecos.get(11), 800.0, 180000.0, proprietarios.get(5)));
	
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
	    Collections.sort(imoveisDispo); // Ordenar por tipo de imovel
	    imoveisMan.add(imoveis.get(5));
	    imoveisMan.add(imoveis.get(0));
	    Collections.sort(imoveisMan); // Ordenar por tipo de imovel
	    
	    //Output
	    
	    for(Cliente cliente : clientes) System.out.println(cliente); // Imprimir clientes
	    for(Corretor corretor : corretores) System.out.println(corretor); // Imprimir corretores
	    for(Proprietario proprietario : proprietarios) System.out.println(proprietario); // Imprimir proprietarios
	    
	    for(ContratoAluguel contratoAluguel : contratosAluguel) { // Imprimir contratos de aluguel
	    	System.out.println(contratoAluguel);
	    	System.out.println();
	    }
	    
	    for(ContratoAluguelComercial contratoCoAluguel : contratosCoAluguel) { // Imprimir contratos comerciais
	    	System.out.println(contratoCoAluguel);
	    	System.out.println();
	    }
	    	
	    for(Imovel imovel : imoveisDispo) System.out.println(imovel); // Imprimir imoveis disponiveis, ordenados pelo tipo
	    for(Imovel imovel : imoveisMan) System.out.println(imovel); // Imprimir imoveis em manutenção, ordenados pelo tipo
	}
}