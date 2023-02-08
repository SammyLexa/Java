package java_Variaveis_e_Operadores;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
	float nota01, nota02, nota03, nota04, notaMedia;
		
		System.out.print("Digite a nota 1: ");
		nota01 = leia.nextFloat();
	
		System.out.print("Digite a nota 2: ");
		nota02 = leia.nextFloat();
		
		System.out.print("Digite a nota 3: ");
		nota03 = leia.nextFloat();
		
		System.out.print("Digite a nota 4: ");
		nota04 = leia.nextFloat();
		
		notaMedia = (nota01 + nota02 + nota03 + nota04)/4;
		System.out.print("Média final:" + notaMedia);
		
		
		
				
	}
}
	

