package e1_estrutura_sequancial;

import java.util.Locale;
import java.util.Scanner;

public class Exer6 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a, b,c , p;
		p = 3.14159;
		
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		double tri = (a *c)/2.0;
		double circArea = p * Math.pow(c, 2.0);
		double trapzeArea = (a + b)*c/2.0;
		double quadArea = Math.pow(b, 2.0);
		double retanArea = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n", tri);
		System.out.printf("CIRCULO: %.3f%n",circArea);
		System.out.printf("TRAPEZIO: %.3f%n", trapzeArea);
		System.out.printf("QUADRADO: %.3f%n",quadArea);
		System.out.printf("RETANGULO: %.3f",retanArea);
		
		sc.close();
	}
}
