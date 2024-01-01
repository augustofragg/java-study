package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		Rent[] r = new Rent[10];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println();
			System.out.printf("Rent #%d\n",(i+1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			r[room] = new Rent(name,email);
		}
		System.out.println();
		
		System.out.println("Busy rooms:");
		for (int i = 0; i < r.length; i++) {
			if (r[i] != null) {
				System.out.println(i + ": " + r[i].toString());
			}
		}
		
	 
		
		
		
		sc.close();
	}
}
