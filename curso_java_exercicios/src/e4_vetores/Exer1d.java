package e4_vetores;

import java.util.Scanner;

public class Exer1d {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();		
		int[] num = new int[n];
		
		for(int i = 0;i < num.length;i ++) {
			System.out.print("Digite um numero: ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		
		for(int i = 0; i < num.length;i++) {
			if (num[i] < 0) {
				System.out.println(num[i]);
			}
		}
		
		
		sc.close();
	}
}
