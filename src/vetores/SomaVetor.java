package vetores;

import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		double sum = 0.0, arme;
		int n;
		
		System.out.print("Quantidade de elementos do vetor: ");
		n = sn.nextInt();
		
		double[] vector = new double[n];		
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("Insira o " + (i + 1) + "º elemento do vetor: ");
			vector[i] = sn.nextDouble();
		}
		
		for (int i = 0; i < vector.length; i++) {
			sum += vector[i];
		}
		
		arme = sum / vector.length;
		
		System.out.print("Elementos do vetor: ");
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%.1f ", vector[i]);
		}
		System.out.println();
		System.out.printf("Soma: %.1f", sum);
		System.out.println();
		System.out.printf("Média: %.1f", arme);
		
		
		sn.close();	
	}

}
