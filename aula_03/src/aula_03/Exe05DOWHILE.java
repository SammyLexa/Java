/*Escreva um algoritmo em Java, que leia a idade 
 * de várias pessoas (números inteiros), via teclado 
 * e mostre na tela o total de pessoas cuja idade 
 * seja menor que 21 anos e o total de pessoas cuja 
 * idade seja maior que 50 anos. A leitura dos dados 
 * deve ser finalizada ao digitar uma idade negativa.
 * link da atividade: https://docs.google.com/document/d/1_zOAPY1LYzxRdQEyr-1NJwa1SESvlCgr/edit?usp=sharing&ouid=107207420183316094320&rtpof=true&sd=true
 */

package aula_03;

import java.util.Scanner;

public class Exe05DOWHILE {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int n, soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			n = leia.nextInt();
			
			if(n > 0)
				soma += n;
		} while(n != 0);
		
		System.out.println("A soma dos números positivos é: " + soma);
		
		leia.close();
	}
}
