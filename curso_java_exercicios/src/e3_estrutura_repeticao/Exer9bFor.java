package e3_estrutura_repeticao;

import java.util.Scanner;

public class Exer9bFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i <= num;i++) {
			int a = i;
			int b =  (int) Math.pow(i, 2);
			int c =  (int) Math.pow(i, 3);
			
			System.out.println(a + " " + b + " " + c);
		}
		
		
		sc.close();
	}
}
