package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle x = new Rectangle();
		
		System.out.println("Enter rectangle width and heighnt");
		x.height = sc.nextDouble();
		x.width = sc.nextDouble();
		
		System.out.println(x);
		
		
		sc.close();
	}
}
