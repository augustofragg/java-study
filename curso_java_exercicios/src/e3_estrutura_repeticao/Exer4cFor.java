package e3_estrutura_repeticao;

import java.util.Scanner;

public class Exer4cFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			sum = sum + 1;
			if((sum % 2 ) != 0) {
				System.out.println(sum);
			}
		}
		
		sc.close();
	}
}
