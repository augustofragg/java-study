package e4_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exer5d {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] num =  new double[n];
		
		for(int i = 0; i < num.length;i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			num[i] = sc.nextDouble();
		}
		System.out.println();
		
		double value = 0.0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > value ) {
				value = num[i];
			}
		}
		
		System.out.printf("MAIOR VALOR = %.2f \n",value );
		
		for (int i = 0; i < num.length; i++) {
			if(value == num[i]) {
				System.out.println("POSICAO DO MAIOR VALOR = " + i);
			}
		}
		
		
		
		
		sc.close();
	}
}
