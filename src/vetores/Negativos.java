package vetores;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		System.out.print("Quantidade de elementos do vetor: ");
		int n = sn.nextInt();
		if (n > 10) {
			System.out.printf("Máximo permitido: 10%nQuantidade de elementos do vetor: ");
			n = sn.nextInt();
		}
		
		int[] vector = new int[n];
		
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("Insira o " + (i + 1) + "º elemento do vetor: ");
			vector[i] = sn.nextInt();
		}
			
		
		System.out.println("Números negativos:");
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < 0) {
				System.out.println(vector[i]);
			}
		}
			
		sn.close();
	}

}
