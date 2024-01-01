package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is dollar price ? ");
		double dolar = sc.nextDouble();
		System.out.print("How many dollars will be bought ? ");
		double real = sc.nextDouble();
		double con = CurrencyConverter.Converter(dolar, real);
		System.out.printf("Amount to be paid in reais = %.2f%n",con );
		sc.close();
	}
}
