package e4_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exer7d {

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
		System.out.println();
		
		double sum = 0.0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		double avg = (double)sum/num.length;
		
		System.out.printf("MEDIA DO VETOR %.3f\n",avg);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < num.length; i++) {
			if (num[i] < avg) {
				System.out.println(num[i]);
			}
		}
		sc.close();
	}

}
