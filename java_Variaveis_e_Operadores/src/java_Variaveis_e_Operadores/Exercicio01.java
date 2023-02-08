package java_Variaveis_e_Operadores;

import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
	float salario, abono, novoSalario;
		
		System.out.print("Digite o Salário: ");
		salario = leia.nextFloat();
	
		System.out.print("Digite o Abono:");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		System.out.print("Exibe o Novo Salário: R$" + novoSalario);
		
		
		
				
	}
}
