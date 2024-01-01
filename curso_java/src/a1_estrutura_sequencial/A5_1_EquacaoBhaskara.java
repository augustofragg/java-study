package a1_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class A5_1_EquacaoBhaskara {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, d, x1, x2;
		
		//Entrada de dados
		System.out.println("Equação do 2 grau");
		System.out.println();
		System.out.print("A: ");
		a = sc.nextDouble();
		System.out.print("B: ");
		b = sc.nextDouble();
		System.out.print("C: ");
		c = sc.nextDouble();
		
		//Processamento de Dados
		d = Math.pow(b, 2.0) - 4*a*c;
		
		if(d < 0) {
			System.out.println("Equação nao possui raiz");
		} else if(d == 0) {
			x1 = (-b + Math.sqrt(d))/(2.0 * a);
			x2 = (-b - Math.sqrt(d))/(2.0 *a);
			System.out.println("Valor de delta: " + d);
			System.out.printf("x1: %.2f%n",x1);
			System.out.printf("x2: %.2f%n",x2);
		}else {
			x1 =(-b + Math.sqrt(d)) /(2.0 *a);
			x2 =( -b - Math.sqrt(d))/(2.0 *a);			
			System.out.println("Valor de delta: " + d);
			System.out.printf("x1: %.2f%n",x1);
			System.out.printf("x2: %.2f%n",x2);
			
		}
		
		
		
		
		
		
		sc.close();
	}
}
