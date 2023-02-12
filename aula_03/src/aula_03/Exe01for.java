/*
 * Escreva um algoritmo em Java, que leia 2 números inteiros via teclado,
 * onde o primeiro número deve ser menor do que o segundo número.
 * Caso contrário, deve ser exibida uma mensagem na tela informando 
 * que o intervalo é inválido e sair do programa. 
 * 
 * Dentro do intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5.
 * 
 * link da atividade: https://docs.google.com/document/d/1_zOAPY1LYzxRdQEyr-1NJwa1SESvlCgr/edit?usp=sharing&ouid=107207420183316094320&rtpof=true&sd=true
*/

package aula_03;

import java.util.Scanner;

public class Exe01for {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n01, n02;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		n01 = leia.nextInt();
		
		System.out.println("Digite o último número do intervalo: ");
		n02 = leia.nextInt();
		
		if(n01 < n02) {
			for(int i = n01; i <= n02; i++ ) {
				if(i%3 == 0 && i%5 == 0) {
					System.out.println("No Intervalo entre: " + n01 + " e " + n02);
					System.out.println(i + " é múltiplo de 3 e 5.");
				} 
			}
		}		
		
		else {
			System.out.println("Intervalo inválido!");
		}
		leia.close();
	}
}
