package e4_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exer8d {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] num = new double[n];
		for (int i = 0; i < num.length; i++) {
			System.out.print("Digite um numero: ");
			num[i] = sc.nextDouble();
		}
		int d = 0;
		double sum = 0.0;
		for (int i = 0; i < num.length; i++) {
			if ((num[i] % 2) == 0) {
				sum = sum + num[i];
				d = d + 1;
			}
		}

		if (sum != 0.0) {
			double avg_pares = sum / d;
			System.out.printf("MEDIA DOS PARES %.2f", avg_pares);
		} else {
			System.out.println("NENHUM PAR");
		}

		sc.close();
	}
}
