package a2_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class B6_escopoInicializacao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double price = sc.nextDouble();
		
		if(price > 100.0) {
			double discount = price * 0.1;
			System.out.println(discount);
		}
		
		System.out.println(price);
		
		
		
		sc.close();
	}
}
