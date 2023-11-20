package trabalho;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*
Fernando
03726779167
2625699
12345678
29/04/2005
a
b
c
d
1
*/
		 
		Cliente c = new Cliente (
					sc.next(), 
					sc.next(), 
					sc.next(), 
					sc.next(), 
					sc.next(),
					new Endereco(sc.next(), sc.next(), sc.next(), sc.next()),
					sc.nextInt()
		);
		
		System.out.println(c);
		
		sc.close();

	}

}
