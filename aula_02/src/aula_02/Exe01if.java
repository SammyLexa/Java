package aula_02;

import java.util.Scanner;

public class Exe01if {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
	int A, B, C, calculo;
	
	
	System.out.println("Digite o número A:");
	A = leia.nextInt();
	System.out.println("Digite o número B:");
	B = leia.nextInt();
	System.out.println("Digite o número C:");
	C = leia.nextInt();
	
	calculo = A + B;
			
	if (calculo > C){
		System.out.println(A + " + " + B + " = " + calculo + " > " + C );
		
		System.out.println("A Soma de A + B é Maior do que C");
	}else if (calculo < C) {
		System.out.println(A + "+" + B + "="+ calculo + " < " + C );
		
		System.out.println("A Soma de A + B é Menor do que C");
	}else {
		System.out.println(A + "+" + B + "="+ calculo + " = " + C );
	
		System.out.println("A Soma de A + B é Igual a C");
		}
	}
}
