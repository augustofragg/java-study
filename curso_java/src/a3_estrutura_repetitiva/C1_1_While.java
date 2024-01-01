package a3_estrutura_repetitiva;

import java.util.Scanner;

public class C1_1_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int i = 0;
		
		while(i < 10) {
			num[i] = sc.nextInt();
			i += 1;
		}
		
		i = 0;
		while(i < 10) {
			if((num[i]%2 == 0)) {
				System.out.print(" - " + num[i]);
			}
			i +=1;
		}
		
		
		sc.close();
	}
}
