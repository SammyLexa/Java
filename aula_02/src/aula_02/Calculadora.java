package aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.##");


		double n1, n2;
		
		System.out.println("Digite o 1º número: ");
		n1 = leia.nextDouble();
		
		
		System.out.println("Digite o 2º número: ");
		n2 = leia.nextDouble();
		
		System.out.println("O número: " + n1 + "elevado ao número " + n2
				+ "é igual a" + Math.pow(n1, n2));
		
		System.out.println("A raiz quadrada do número é: " + n1 
				+ df.format(Math.sqrt(n1)));
		
		System.out.println("Pré Incremento");
		System.out.println(n1);
		System.out.println(++n1);
		
		System.out.println("Pôs Incremento");
		System.out.println(n2);
		System.out.println(n2++);
		System.out.println(n2);
		
		System.out.println(n1 += n2);
		
		leia.close();
	}
}
