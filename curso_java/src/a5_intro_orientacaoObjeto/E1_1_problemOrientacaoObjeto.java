package a5_intro_orientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;

public class E1_1_problemOrientacaoObjeto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, xArea, yA, yB, yC, yArea;
		
		System.out.println("Enter the measure of triangle X:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		xArea = triangle(xA,xB,xC);
				
		System.out.println("Enter the measure of triangle Y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		yArea = triangle(yA,yB,yC);
		
		showResult(xArea,yArea);
				
		sc.close();
	}
	
	public static double triangle(double x, double y, double z) {
		double area,p;		
		p = (x + y + z)/2.0;
		area = Math.sqrt(p * (p - x) * (p - y) * (p - z));
				
		return area;
	}
	
	public static void showResult(double value, double valueb) {
		System.out.printf("Triangle X area: %.4f %n", value);
		System.out.printf("Triangle Y area: %.4f %n", valueb);
		
		if(value > valueb ) {
			System.out.println("Larger: X");
		}else {
			System.out.println("Larger: Y");
		}
	}
}
