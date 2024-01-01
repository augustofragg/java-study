package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student std = new Student();
		std.name = sc.nextLine();
		std.Sgrade(sc.nextDouble());
		std.Sgrade(sc.nextDouble());
		std.Sgrade(sc.nextDouble());
		
		System.out.println(std);
		if(std.nota >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS",(60.00 - std.nota));
		}
		
		
		sc.close();
	}
}
