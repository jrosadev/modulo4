package vetores;

import java.util.Scanner;

public class Aprovados {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		System.out.print("Quantidade de alunos: ");
		int n = sn.nextInt();
		
		String[] name = new String[n];
		double[] firstgrade = new double[n];
		double[] secondgrade = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Insira os dados do " + (i + 1) + "º aluno:");
			System.out.println();
			System.out.print("Nome: ");
			name[i] = sn.next();
			System.out.print("Primeira nota: ");
			firstgrade[i] = sn.nextDouble();
			System.out.print("Segunda nota: ");
			secondgrade[i] = sn.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		for (int i=0; i<n; i++) {
			double arme = (firstgrade[i] + secondgrade[i]) / 2;
			if (arme >= 6.0) {
				System.out.println(name[i]);
			}
		}
		
		sn.close();

	}

}
