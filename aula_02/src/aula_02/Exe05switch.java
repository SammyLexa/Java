package aula_02;

import java.util.Scanner;

public class Exe05switch {
	
	
	static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {
		
		int codigo;
		float quantidade;
		
		System.out.println("CÓDIGO \t\tPRODUTO \t\tPREÇO UNITÁRIO");
		System.out.println("1 \t\tCachorro Quente \tR$ 10.00");
		System.out.println("2 \t\tX-Salada \t\tR$ 15.00");
		System.out.println("3 \t\tX-Bacon \t\tR$ 18.00");
		System.out.println("4 \t\tBauru   \t\tR$ 12.00");
		System.out.println("5 \t\tRefrigerante \t\tR$ 8.00");
		System.out.println("6 \t\tSuco de laranja  \tR$ 13.00");
		System.out.println("\n");
		System.out.println("Digite o código do produto:");
		codigo = leia.nextInt();
		System.out.println("Digite a quantidade do produto:");
		quantidade = leia.nextInt();
		
		switch(codigo){
		
		case 1:
			System.out.println("Produto: Cachorro Quente");
			System.out.println("Valor total: "+(quantidade*10.00));
			break;
		case 2:
			System.out.println("Produto: X-Salada");
			System.out.println("Valor total: "+(quantidade*15.00));
			break;	
		case 3:
			System.out.println("Produto: X-Bacon");
			System.out.println("Valor total: "+(quantidade*18.00));
			break;
		case 4:
			System.out.println("Produto: Bauru");
			System.out.println("Valor total: "+(quantidade*12.00));
			break;
		case 5:
			System.out.println("Produto: Refrigerante");
			System.out.println("Valor total: "+(quantidade*8.00));
			break;
		case 6:
			System.out.println("Produto: Suco de laranja");
			System.out.println("Valor total: "+(quantidade*13.00));
			break;
		}
	}

}