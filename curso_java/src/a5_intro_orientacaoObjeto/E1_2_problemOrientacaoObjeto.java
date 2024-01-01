package a5_intro_orientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;

public class E1_2_problemOrientacaoObjeto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the measure of triangle X: ");
		Triangle x = new Triangle();
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measure of triangle Y: ");
		Triangle y = new Triangle();
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		showResult(x.area(),y.area());
		sc.close();
	}
	
	public static void showResult(double value, double valueb) {
		System.out.printf("Triangle X area: %.4f%n",value);
		System.out.printf("Triangle Y area: %.4f%n",valueb);
		
		if(value > valueb) {
			System.out.println("Larger: X");
		}else {
			System.out.println("Larger: Y");
		}
	}
}
