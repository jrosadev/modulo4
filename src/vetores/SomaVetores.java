package vetores;

import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		System.out.print("Quantidade de elementos de cada vetor: ");
		int n = sn.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		for (int i = 0; i < a.length; i++) {
			System.out.printf("Insira o " + (i + 1) + "º elemento do vetor a: ");
			a[i] = sn.nextInt();
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.printf("Insira o " + (i + 1) + "º elemento do vetor b: ");
			b[i] = sn.nextInt();
		}
		
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i] + b[i];
		}
		
		System.out.print("Vetor resultante: ");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
				
		sn.close();

	}

}
