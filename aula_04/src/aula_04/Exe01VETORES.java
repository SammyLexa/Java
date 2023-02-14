package aula_04;

import java.util.Arrays;
import java.util.Scanner;

public class Exe01VETORES {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		int Vetor[] = {2,5,1,3,4,9,7,8,10,6};
		int n;
		
		System.out.println("Digite o número que deseja encontrar: ");
		n = leia.nextInt();
		
		for(int c = 0; c < Vetor.length; c++) {
			if(n == Vetor[c]) {
				System.out.printf("O número %d está localicado na posição %d", n, c);
				break;
			}else {
				if(Vetor.length - 1 == c) {
					System.out.println("O número não foi achado...");
				}
				
			}
			
		}
		
	}

}