package java_Variaveis_e_Operadores;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		salarioBruto = 2000;
		adicionalNoturno = 500;
		horasExtras = 100;
		descontos = 200;
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		
		System.out.print("O salário líquido é:" + salarioLiquido);
		
	}	
}
