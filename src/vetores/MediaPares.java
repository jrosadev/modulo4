package vetores;

import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		
		double arme;
		int sum = 0, counter = 0, n;

		System.out.print("Quantidade de elementos no vector: ");
		n = sn.nextInt();

		int[] vector = new int[n];
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("Insira o " + (i + 1) + "º elemento do vetor a: ");
			vector[i] = sn.nextInt();
			if (vector[i] % 2 == 0) {
				sum += vector[i];
				counter += 1;
			}
		}
		
		if (sum == 0) {
			System.out.print("Não há números pares");
		} else {
			arme = sum / counter;
			System.out.printf("Média dos números pares: " + arme);
		}

		sn.close();
	}

}
