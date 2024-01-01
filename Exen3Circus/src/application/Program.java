package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circle;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		System.out.printf("Circumference: %.2f%n",Circle.Circumference(radius));
		System.out.printf("Volume: %.2f%n",Circle.Volume(radius));
		System.out.printf("PI value: %.2f", Circle.pi);
		sc.close();
	}
}
