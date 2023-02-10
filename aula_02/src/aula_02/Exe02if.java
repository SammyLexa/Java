package aula_02;

import java.util.Scanner;

public class Exe02if {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um número:");
		n = leia.nextInt();
		
		if (n % 2 == 0 && n >= 0) {
			System.out.println("O Número " + n + " é par e positivo!");}
		
		else if(n % 2 == 0 && n < 0) {	
			System.out.println("O Número " + n + " par e negativo!");}
		
		else if(n % 2 != 0 && n < 0) {
			System.out.println("O Número " + n + " ímpar e negativo!");}
		
		else {
			System.out.println("O Número " + n + " ímpar e positivo");}

		leia.close();
	}
	
}
