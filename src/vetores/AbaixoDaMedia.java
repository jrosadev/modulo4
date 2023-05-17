package vetores;

import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		double arme;
		int n;
		
		System.out.println("Quantidade de elementos do vetor: ");
		n = sn.nextInt();
		
		double[] vector = new double[n];
		double sum = 0;
		
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("Insira o " + (i + 1) + "º elemento do vetor a: ");
			vector[i] = sn.nextDouble();
			sum += vector[i];
		}
		
		arme = sum / vector.length;
		System.out.printf("Média do vetor: %.3f", arme);
		
		System.out.println();
		
		System.out.println("Elementos abaixo da média:");
		for (int i = 0; i < vector.length; i++) {
			if (vector[i] < arme) {
				System.out.println(vector[i]);
			}
		}
		
		sn.close();

	}

}
