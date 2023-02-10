package aula_02;

import java.util.Scanner;

public class Exe03if {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int idade;
		String nome;
		boolean doacao;
		
		System.out.println("Digite seu nome:");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("Digite sua idade:");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação?");
		doacao = leia.nextBoolean();
		
		if(idade >= 60 && idade <= 69) {
			if(doacao)
				System.out.println(nome + " não está apta para doar sangue!");
			else
				System.out.println(nome + " está apta para doar sangue!");
		}
		
		else if (idade < 18 || idade > 69)
			System.out.println(nome + " não está apta para doar sangue!");
		else
			System.out.println(nome + " está apta para doar sangue!");
		
		leia.close();
		
	}
	
}
