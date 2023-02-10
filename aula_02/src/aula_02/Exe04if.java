package aula_02;

import java.util.Scanner;

public class Exe04if {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String animal01, animal02, animal03;
		
		System.out.println("Digite o primeiro animal");
		leia.skip("\\R?");
		animal01 = leia.nextLine();
		
		System.out.println("Digite o segundo animal");
		leia.skip("\\R?");
		animal02 = leia.nextLine();
		
		System.out.println("Digite o terceiro animal");
		leia.skip("\\R?");
		animal03 = leia.nextLine();
		
		if (animal01.equals("vertebrado"))
			if (animal02.equals("ave")) {
				if (animal03.equals("carnívero"))
					System.out.println("águia");
				else
					System.out.println("pomba");}
			else {
				if (animal03.equals("onívoro")) 
					System.out.println("homem");
				}else {
						System.out.println("lagarta");
				} 
		
		leia.close();
	}
}
