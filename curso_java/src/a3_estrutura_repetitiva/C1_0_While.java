package a3_estrutura_repetitiva;

import java.util.Scanner;

public class C1_0_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int s = 0;
		
		while(num != 0) {
			s = s + num;
			num = sc.nextInt();
		}
		
		System.out.println(s);
		
		sc.close();
	}
}
