package aula_02;

import java.util.Scanner;

public class ProjetoSaude {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite a sua idade: ");
		idade = leia.nextInt();
		System.out.println();
		if(idade >=0 && idade<= 10)
			System.out.println("O valor do seu Plano de Sáude será de R$ 100,00");
		else if(idade > 10 && idade<=29)
			System.out.println("O valor do seu Plano de Sáude será de R$ 200,00");
		else if(idade > 29 && idade<=45)
			System.out.println("O valor do seu Plano de Sáude será de R$ 300,00");
		else if(idade > 45 && idade<=59)
			System.out.println("O valor do seu Plano de Sáude será de R$ 500,00");
		else if(idade > 59 && idade<=65)
			System.out.println("O valor do seu Plano de Sáude será de R$ 600,00");
		else if (idade > 65)
			System.out.println("O valor do seu Plano de Sáude será de R$ 1000,00");
		else
			System.out.println("Idade inválida!");
		
		
	}
}
