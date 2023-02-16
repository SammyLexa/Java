package aula_05;

import java.util.Scanner;
import java.util.Stack;

/*
 * Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String, para organizar a retirada de livros em uma pilha. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
2: Listar todos os livros da Pilha
3: Retirar um livro da pilha 
0: O programa deve ser finalizado. 
Caso a pilha esteja vazia e o atendente tente retirar um livro da pilha, ele deverá informar que a pilha está vazia.
*/

public class Exe02Pilha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		String nome;
		int opcao = 0;
		
		for(int contador = 1; contador != 0; contador++) {
			System.out.println("1 - Adicionar um livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livros");
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
				pilha.push(nome);
				System.out.println("Livro Adicionado!");
				break;
			case 2:
				pilha.forEach(System.out::println);
				break;
			case 3:
				System.out.println("Retirar um elemento da fila");
				if(pilha.isEmpty())
					System.out.println("A Pilha está vazia!");
				else
					System.out.println("O livro " + pilha.pop() + " foi retirado da pilha!");
				break;
			default:
				System.out.println("Opção inválida");
			}
		}
		
	}
}
