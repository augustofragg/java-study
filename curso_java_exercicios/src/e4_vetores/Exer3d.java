package e4_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exer3d {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		double avgHeight = 0.0;
		int aux = 0;
		double pct = 0.0;
		
		System.out.print("Quantas pessoas serao digitas? ");
		int n = sc.nextInt();
		String[] name = new String[n];
		int[] age = new int[n];
		double[] height = new double[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:\n",(i+1));
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
			System.out.print("Altura: ");
			height[i] = sc.nextDouble();
			
			sum += height[i];
			if (age[i] < 16) {
				aux += 1;
			}
		}
		System.out.println();
		
		avgHeight = sum / n;
		pct = ((double)aux/n) * 100.00;
		
		System.out.printf("Altura média = %.2f\n",avgHeight);
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n",pct);
		
		
		for (int i = 0; i < n; i++) {
			if (age[i] < 16) {
				System.out.println(name[i]);
			}
		}
		 
		sc.close();
	}
}
