package e3_estrutura_repeticao;

import java.util.Scanner;

public class Exer1cWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 2002;
		int num = 0;
		
		while(num != x) {
		    num = sc.nextInt();
			if(num == x) {
				System.out.println("Acesso Permitdo");
			}else {
				System.out.println("Senha Invalido");
			}
		}
		
		
		sc.close();
	}
}
