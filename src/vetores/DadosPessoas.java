package vetores;

import java.util.Scanner;
import entities.Pessoas;

public class DadosPessoas {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		double highest = 0, smaller = 100, womenmehe, height, sum = 0;
		int n, counter = 0, totalmen = 0;
		char gender;
		
		System.out.print("Quantidade de pessoas: ");
		n = sn.nextInt();
		
		Pessoas[] vector = new Pessoas[n];
		for (int i=0; i<vector.length; i++) {
			System.out.print("Gênero da " + (i+1) + "ª pessoa: ");
			gender = sn.next().charAt(0);
			System.out.print("Altura da " + (i+1) + "ª pessoa: ");
			height = sn.nextDouble();
			vector[i] = new Pessoas(gender, height);
		}
		
		for (int i=0; i<vector.length; i++) {
			if (vector[i].getHeight() < smaller) {
				smaller = vector[i].getHeight();
			}
			if (vector[i].getHeight() > highest) {
				highest = vector[i].getHeight();
			}
			if (vector[i].getGender() == 'F' || vector[i].getGender() == 'f') {
				counter += 1;
				sum += vector[i].getHeight();
			}
			if (vector[i].getGender() == 'M' || vector[i].getGender() == 'm') {
				totalmen += 1;
			}
		}
		
		womenmehe = sum / counter;
		
		System.out.printf("Menor altura: " + smaller);
		System.out.println();
		System.out.printf("Maior altura: "+ highest);
		System.out.println();
		System.out.printf("Média de altura das mulheres: %.2f", womenmehe);
		System.out.println();
		System.out.printf("Quantidade de homens: " + totalmen);
		
		sn.close();
	}

}
