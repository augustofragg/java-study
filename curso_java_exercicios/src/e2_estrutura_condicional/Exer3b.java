package e2_estrutura_condicional;

import java.util.Scanner;

public class Exer3b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a < b) {
			int aux = a;
			a = b;
			b = aux;
			if((a % b) == 0) {
				System.out.println("Sao Multiplos");
			}else {
				System.out.println("Nao sao multiplos");
			}
		}else {
			if((a % b) == 0) {
				System.out.println("Sao Multiplos");
			}else {
				System.out.println("Nao sao multiplos");
			}
		}
		
		
		sc.close();
	}
}
