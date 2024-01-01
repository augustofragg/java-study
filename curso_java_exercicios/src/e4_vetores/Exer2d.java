package e4_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exer2d {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] num = new double[n];
		
		for(int i = 0; i < num.length;i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			num[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("Valores: ");
		double sum = 0.0;
		for(int i = 0; i< num.length;i++) {
			System.out.printf("%.2f ",num[i]);
			sum = sum + num[i];
		}
		double avg = sum/num.length;
		System.out.println();
		
		System.out.printf("SOMA = %.2f%n",sum);
		System.out.printf("MEDIA = %.2f",avg);
		
		
		
		sc.close();
	}
}
