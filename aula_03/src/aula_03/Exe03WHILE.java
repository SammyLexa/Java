/* Escreva um algoritmo em Java, que leia a idade 
 * de várias pessoas (números inteiros), via teclado e 
 * mostre na tela o total de pessoas cuja idade seja 
 * menor que 21 anos e o total de pessoas cuja idade 
 * seja maior que 50 anos. A leitura dos dados deve 
 * ser finalizada ao digitar uma idade negativa. 
 * link da atividade: https://docs.google.com/document/d/1_zOAPY1LYzxRdQEyr-1NJwa1SESvlCgr/edit?usp=sharing&ouid=107207420183316094320&rtpof=true&sd=true
*/

package aula_03;

import java.util.Scanner;

public class Exe03WHILE {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int idade = 0, c21 = 0, c50 = 0;
		
		while(idade >= 0) {
			System.out.println("Entre com a idade da pessoa: ");
			idade = leia.nextInt();
			
			if(idade < 21 && idade > 0)
				c21++;
			
			else if(idade > 50)
				c50++;
		
		}
		System.out.println("Total de pessoas menores de 21 anos: " + c21);
		System.out.println("Total de pessoas maiores de 50 anos: " + c50);
		leia.close();
	}
}
