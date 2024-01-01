package a4_topicos_especiais;

import java.util.Scanner;

public class D3_0_funcoes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter three numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if((a > b) && (a > c)) {
			System.out.println("Highter = " + a);
			
		}else if(b > c) {
			System.out.println("Highter = " + b);
			
		}else {
			System.out.println("Highter = " + c);
		}
		
		
		
		sc.close();
	}
}
