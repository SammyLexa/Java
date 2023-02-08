package java_Variaveis_e_Operadores;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float n01, n02, n03, n3, n04, calculo, calculo2;
		
		n01 = 5;
		n02 = 6;
		n03 = 7;
		n3 = -7;
		n04 = 8;
		calculo = (n01 * n02) - (n03 * n04);
		calculo2 = (n01 * n02) - (n3 * n04);
		System.out.println("A diferença é:" + calculo);
		System.out.print("A diferença é:" + calculo2);
	}
}
