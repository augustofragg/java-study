package e1_estrutura_sequancial;

import java.util.Locale;
import java.util.Scanner;

public class Exer5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int code, qtd, code_b, qtd_b;
		double v, v_b, p1, p2, total;
		
		code = sc.nextInt();
		qtd = sc.nextInt();
		v = sc.nextDouble();
		
		p1 = qtd * v;
		
		code_b = sc.nextInt();
		qtd_b = sc.nextInt();
		v_b = sc.nextDouble();
		
		p2 = qtd_b * v_b;
		
		total = p1 + p2;
		
		System.out.println("Codigo 1: " + code + " Codigo 2: " + code_b);
		System.out.printf("VALOR A PAGAR: R$ %.2f",total);
		
		sc.close();
	}
}
