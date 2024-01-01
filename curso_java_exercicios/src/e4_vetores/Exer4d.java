package e4_vetores;

import java.util.Scanner;

public class Exer4d {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] num =  new int[n];
		
		for(int i = 0; i < num.length;i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			num[i] = sc.nextInt();
		}
		System.out.println();
		
		System.out.println("NUMEROS PARES: ");
		int numb = 0;
		for (int i = 0; i < num.length; i++) {
			if ((num[i]%2) == 0) {
				System.out.print(num[i] + " ");
				numb = numb + 1;
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.println("QUANTIDADE DE PARES = " + numb);
		
		sc.close();
	}
}
