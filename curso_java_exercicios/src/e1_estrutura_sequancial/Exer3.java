package e1_estrutura_sequancial;

import java.util.Scanner;

public class Exer3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, dif;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		dif = (a * b - c * d);
		
		System.out.println("DIFERENCA = " + dif);
		
		
		
		sc.close();
	}
}
