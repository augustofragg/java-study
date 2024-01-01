package a7_Memoria_Array_listas;

import java.util.Locale;
import java.util.Scanner;

public class F2_1_vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Productb[] p = new Productb[n];
		
		for(int i = 0;i < p.length;i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			p[i] = new Productb(name,price);
		}
		
		double sum = 0.0;
		for(int i = 0;i < p.length; i++) {
			sum = sum + p[i].getPrice();					
		}
		
		double avg = sum/p.length;
		
		System.out.printf("AVERAGE = %.2f",avg);
		
		sc.close();
	}
}
