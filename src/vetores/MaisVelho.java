package vetores;

import java.util.Scanner;

public class MaisVelho {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		String oldestname = null;
		int oldest = 0, n;
		
		System.out.print("Quantidade de pessoas: ");
		n = sn.nextInt();
		
		String[] a = new String[n];
		int[] b = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Insira os dados da " + (i + 1) + "ª pessoa:");
			System.out.println();
			System.out.print("Nome: ");
			a[i] = sn.next();
			System.out.print("Idade: ");
			b[i] = sn.nextInt();
			if (b[i] > oldest) {
				oldest = b[i];
				oldestname = a[i];
			}
		}
		
		System.out.printf("Pessoa mais velha: " + oldestname);
		
		sn.close();
	}

}
