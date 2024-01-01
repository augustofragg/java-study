package e3_estrutura_repeticao;

import java.util.Scanner;

public class Exer3cWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = 0;
		int g = 0;
		int d = 0;
		
		
		do {
			if(num == 1) {
				a = a + 1;
				
			}else if(num == 2) {
				g = g + 1;
				
			}else if(num == 3) {
				d = d + 1;
				
			}
			
			num = sc.nextInt();
		}while(num != 4);
		
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + a);
		System.out.println("Gasolina: " + g);
		System.out.println("Diesel: " + d);
		
		sc.close();
	}
}
