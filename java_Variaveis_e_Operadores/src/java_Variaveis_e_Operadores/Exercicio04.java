package java_Variaveis_e_Operadores;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float n01, n02, n03, n04, calculo;
		
		/*n01 = 5;
		n02 = 6;
		n03 = 7 e -7;
		n04 = 8;*/
		
		System.out.print("Digite o número 1: ");
		n01 = leia.nextFloat();
		System.out.print("Digite o número 2: ");
		n02 = leia.nextFloat();
		System.out.print("Digite o número 3: ");
		n03 = leia.nextFloat();
		System.out.print("Digite o número 4: ");
		n04 = leia.nextFloat();
		calculo = (n01 * n02) - (n03 * n04);
		
		System.out.println("A diferença é:" + calculo);
	}
}
