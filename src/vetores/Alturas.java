package vetores;

import java.util.Scanner;
import entities.Dados;

public class Alturas {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		int counter = 0, n, age;
		double sum = 0.0, arme, percent, height;
		String name;
		
		System.out.print("Quantidade de elementos do vetor: ");
		n = sn.nextInt();
		
		Dados[] vector = new Dados[n];				
		for (int i = 0; i < vector.length; i++) {
			sn.nextLine();
			System.out.println("Dados da " + (i + 1) + "ª pessoa");
			System.out.print("Nome: ");
			name = sn.nextLine();
			System.out.print("Idade: ");
			age = sn.nextInt();
			System.out.print("Altura: ");
			height = sn.nextDouble();
			vector[i] = new Dados(name, age, height);
		}
		
		for (int i = 0; i < vector.length; i++) {
			sum += vector[i].getHeight();
		}
		
		arme = sum / vector.length;
		
		for (int i = 0; i < vector.length; i++)
			if (vector[i].getAge() < 16) {
				counter += 1;
			}
		
		percent = (counter * 100) / vector.length;
		
		System.out.println();
		
		System.out.printf("Altura média: %.2f", arme);
		
		System.out.println();
		
		System.out.printf("Porcentagem de menores de 16 anos: %.2f", percent);
		
		System.out.println();
		
		for (int i = 0; i < vector.length; i++) {
			if (vector[i].getAge() < 16) {
				System.out.println(vector[i].getName());
			}
		}
		
		sn.close();
	}
}


// altura média | % - 16 e nomes