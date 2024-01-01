package e1_estrutura_sequancial;

import java.util.Locale;
import java.util.Scanner;

public class Exer2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double r, area;
		double p = 3.14159;
		
		r = sc.nextDouble();
		
		area = p * Math.pow(r, 2);
		
		System.out.printf("A = %.4f",area);
		
		sc.close();
	}
}
