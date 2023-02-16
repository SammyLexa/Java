package aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String, para organizar a ordem de chegada dos Clientes de um Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
2: Listar todos os Clientes na fila
3: Chamar (retirar) uma pessoa da fila 
0: O programa deve ser finalizado. 
Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila.
link: https://docs.google.com/document/d/1pOTvj9EIUQ3CCORZwarlPGaaN_PiS0ky/edit?usp=sharing&ouid=107207420183316094320&rtpof=true&sd=true
 * */


public class Exe01Fila {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		String nome;
		int opcao = 0;

		while(true) {
			System.out.println("1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar cliente");
			System.out.println("0 - Sair");
			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();
			
			if (opcao == 0) {
			System.out.println("Programa finalizado!");
			leia.close();
			System.exit(0);
			}
			
			switch(opcao) {
			case 1:
				System.out.println("Digite um nome: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				fila.add(nome);
				System.out.println("Cliente Adicionado!");
				break;
			case 2:
				fila.forEach(System.out::println);
				break;
			case 3:
				if(fila.isEmpty())
					System.out.println("A fila está vazia!");
				else
					System.out.println("Cliente " + fila.poll() + " foi Chamado!");
				break;
			default:
				System.out.println("Opção inválida");
			}
			
		}
	}
	
}
