package vetores;

import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		double highest = 0.0;
		int index = 0, n;
		
		System.out.print("Quantidade de elementos do vetor: ");
		n = sn.nextInt();
		
		double[] vector = new double[n];
		
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("Insira o " + (i + 1) + "º elemento do vetor: ");
			vector[i] = sn.nextDouble();
			
			if (vector[i] > highest) {
				highest = vector[i];
				index = i;
			}
		}	
		
		System.out.printf("Maior elemento: %.1f %n", highest);
		System.out.printf("Posição do maior elemento: " + index);
		
		sn.close();

	}

}
