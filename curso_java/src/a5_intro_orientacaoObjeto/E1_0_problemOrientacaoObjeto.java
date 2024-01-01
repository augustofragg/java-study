package a5_intro_orientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;

public class E1_0_problemOrientacaoObjeto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, xArea, xP, yA, yB, yC, yArea, yP;
		
		System.out.println("Enter the measure of triangle X:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Enter the measure of triangle Y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		xP = (xA + xB + xC)/2.0;
		xArea = Math.sqrt(xP *(xP - xA)*(xP - xB)*(xP - xC));
		
		yP = (yA + yB + yC)/2.0;
		yArea = Math.sqrt(yP *(yP - yA)*(yP - yB)*(yP - yC));
		
		System.out.printf("Triangle X area: %.4f %n",xArea);
		System.out.printf("Triangle Y area: %.4f %n",yArea);
		
		if(xArea > yArea) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}
		
		
		sc.close();
	}
}
