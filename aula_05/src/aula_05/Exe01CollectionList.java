package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exe01CollectionList {

	public static void main (String[] arg) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		int quantidadeMaxima = 5;/*se usa a variavel quantidadeMaxima pois dessa forma se torna possivel alterar o valor 5 para qualquer
		outro número dessa forma, podemos aumentar os números requisitados*/
		
		for(int contador = 0; contador < quantidadeMaxima; contador++) { /*quantidadeMaxima poderia ser substituida por 5*/
			System.out.println("Digite uma cor:");
			leia.skip("\\R?");
			cores.add(leia.nextLine()); /*igual o método anterior(cores = nextLine) mas feito para collection*/
		}
		
		System.out.println("Listar todas as cores");
		cores.forEach(System.out::println);/*igual o for each mas é um método da collection*/
		
		System.out.println("\nOrdenar as cores");
		cores.sort(null);/*ordena em ordem alfabetica*/
		cores.forEach(System.out::println);
		
		leia.close();
	}
}
