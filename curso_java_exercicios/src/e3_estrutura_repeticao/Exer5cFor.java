package e3_estrutura_repeticao;

import java.util.Scanner;

public class Exer5cFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = 0;
		int out = 0;
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if((num <= 10) && (num <= 20)) {
				in = in + 1;
			}else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}
}
