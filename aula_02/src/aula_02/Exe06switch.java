package aula_02;

import java.util.Scanner;

public class Exe06switch {
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int codigo;
	float salario;
	String nome;
	
	System.out.println("Código dos cargos ");
	System.out.println("1-\tGerente. ");
	System.out.println("2-\tVendedor. ");
	System.out.println("3-\tSupervisor. ");
	System.out.println("4-\tMotorista. ");
	System.out.println("5-\tEstoquista. ");
	System.out.println("6-\tTécnico de TI. ");
	
	System.out.println("Digite o nome do colaborador: ");
	leia.skip("\\R?");
	nome = leia.nextLine();
	System.out.println("Digite o codigo do seu cargo: ");
	codigo = leia.nextInt();
	System.out.println("Digite seu salário atual: ");
	salario = leia.nextFloat();
	
	switch (codigo) {
	case 1: 
		System.out.println("Colaborador: " + nome);
		System.out.println("O seu cargo é: Gerente" );
		System.out.println("O seu salário foi reajustado para:  " + (salario + (salario * 10/100)));
		
		
		break;
	case 2: 
		System.out.println("Colaborador: " + nome);
		System.out.println("O seu cargo é: Vendedor" );
		System.out.println("O seu salário foi reajustado para:  " + (salario + (salario * 7/100)));
		break;
	case 3:
		System.out.println("Colaborador: " + nome);
		System.out.println("O seu cargo é: Supervisor" );
		System.out.println("O seu salário foi reajustado para:  " + (salario + (salario * 9/100)));
		break;
	case 4:
		System.out.println("Colaborador: " + nome);
		System.out.println("O seu cargo é: Motorista" );
		System.out.println("O seu salário foi reajustado para:  " + (salario + (salario * 6/100)));
		break;
	case 5:
		System.out.println("Colaborador: " + nome);
		System.out.println("O seu cargo é: Estoquista" );
		System.out.println("O seu salário foi reajustado para:  " + (salario + (salario * 5/100)));
		break;
	case 6:
		System.out.println("Colaborador: " + nome);
		System.out.println("O seu cargo é: Técnico de T.I" );
		System.out.println("O seu salário foi reajustado para:  " + (salario + (salario * 8/100)));
		break;
		default:
			System.out.println("Código Inválido!");
		
	
	}
	leia.close(); }
	
	
}


