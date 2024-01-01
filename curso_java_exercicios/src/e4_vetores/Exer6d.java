package e4_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exer6d {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] num =  new int[n];
		int[] numb = new int[n]; 
		int[] sum = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < numb.length; i++) {
			numb[i] = sc.nextInt();
		}
		
		for (int i = 0; i < sum.length; i++) {
			sum[i] = num[i] + numb[i];
		}
		
		for (int i = 0; i < sum.length; i++) {
			System.out.println(sum[i]);
		}
		
		
		
		System.out.println();
		
		sc.close();
	}
}
