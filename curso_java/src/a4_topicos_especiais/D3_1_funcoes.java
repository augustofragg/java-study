package a4_topicos_especiais;

import java.util.Scanner;

public class D3_1_funcoes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, highter;
		System.out.println("Enter three numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		highter = max(a,b,c);
		
		showHighter(highter);
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int num;
		
		if((x > y) && (x > z)) {
			num = x;
			
		}else if (y > z) {
			num = y;
			
		}else {
			num = z;
		}
		
		return num;
	}
	
	public static void showHighter(int value) {
		 System.out.println("Highter = " + value);
	}
}
