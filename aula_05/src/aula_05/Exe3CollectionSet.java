package aula_05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*Escreva um programa Java para criar uma Collection Set
 *  de Objetos da Classe Wrapper Integer. O programa 
 *  deverá solicitar ao usuário, que ele digite via 
 *  teclado 10 valores inteiros não repetidos e 
 *  adicione-os individualmente na Collection Set. 
 *  Em seguida, faça o que se pede:
 *  Mostre na tela todos os elementos da Collection Set, 
 *  utilizando a Classe Iterator. 
 *  Veja o exemplo abaixo:
 *  Link :https://docs.google.com/document/d/1q6C7ckiYWGkZeyI1LvLLfEykEoypriPw/edit?usp=sharing&ouid=107207420183316094320&rtpof=true&sd=true
*/

public class Exe3CollectionSet {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> numero = new HashSet<Integer>();
		
		int valor;
		boolean continuar;
		
		System.out.println("Quer inserir um número? 1 - true ou 2 - false");
		continuar = leia.nextBoolean();
		
		while(continuar == true) {
			System.out.println("Digite o numero desejada: ");
			valor = leia.nextInt();
			numero.add(valor);
			
			System.out.println("Quer inserir um número? 1 - true ou 2 - false");
			continuar = leia.nextBoolean();
		}
		
		System.out.println("Listar todas os números");
		numero.forEach(System.out::println);


	}
}