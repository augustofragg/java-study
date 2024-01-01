package e3_estrutura_repeticao;

import java.util.Scanner;

public class Exer7cFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = 1;
		int N = sc.nextInt();
		
		for(int i = 1; i <=N; i++) {
			r =  r * i;
		}
		
		System.out.println(r);
		
		
		sc.close();
	}
}
