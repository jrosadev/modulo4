package vetores;

import java.util.Scanner;

import entities.Mercadorias;

public class Comerciante {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		
		String name;
		double purchase, retail, profit, totalpurchase = 0, totalretail = 0, totalprofit = 0;
		int n, countera = 0, counterb = 0, counterc = 0;
		
		System.out.print("Quantidade de mercadorias: ");
		n = sn.nextInt();
		
		Mercadorias[] vector = new Mercadorias[n];
		for (int i=0; i<vector.length; i++) {
			System.out.printf((i+1) + "º produto");
			System.out.println();
			System.out.print("Nome: ");
			name = sn.next();
			System.out.print("Preço de compra: ");
			purchase = sn.nextDouble();
			totalpurchase += purchase;
			System.out.print("Preço de venda: ");
			retail = sn.nextDouble();
			totalretail += retail;
			vector[i] = new Mercadorias(name, purchase, retail);
		}
		
		for (int i=0; i<vector.length; i++) {
			profit = vector[i].getRetail() - vector[i].getPurchase();
			totalprofit += profit;
			if (profit < (vector[i].getPurchase() * 10 / 100)) {
				countera += 1;
			} else if (profit >= (vector[i].getPurchase() * 10 / 100) && profit <= (vector[i].getPurchase() * 20 / 100)) {
				counterb += 1;
			} else if (profit > (vector[i].getPurchase() * 20 / 100)) {
				counterc += 1;
			}
		}
	
		System.out.println("Relatório");
		System.out.printf("Lucro abaixo de 10: " + countera);
		System.out.println();
		System.out.printf("Lucro entre 10 e 20: " + counterb);
		System.out.println();
		System.out.printf("Lucro acima de 20: " + counterc);
		System.out.println();
		System.out.printf("Valor total de compra: %.2f", totalpurchase);
		System.out.println();
		System.out.printf("Valor total de venda: %.2f", totalretail);
		System.out.println();
		System.out.printf("Lucro total: %.2f", totalprofit);
		
		sn.close();

	}

}
