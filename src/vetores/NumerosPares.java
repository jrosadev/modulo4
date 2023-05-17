package vetores;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		int counter = 0, n;
		
		System.out.print("Quantidade de elementos do vetor: ");
		n = sn.nextInt();
		
		int[] vector = new int[n];		
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("Insira o " + (i + 1) + "º elemento do vetor: ");
			vector[i] = sn.nextInt();
		}
		
		System.out.println("Números pares:");
		
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] % 2 == 0) {
				System.out.println(vector[i]);
				counter += 1;
			}
		}
		
		System.out.printf("Quantidade de números pares:%n" + counter);
		
		sn.close();
	}

}
