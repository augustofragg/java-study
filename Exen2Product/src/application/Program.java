package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		System.out.println("Enter product Data");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		product.AddProducts(sc.nextInt());
		System.out.println();
		System.out.println("Update data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		product.RemoveProducts(sc.nextInt());
		System.out.println();
		System.out.println("Updated data: " + product);
		
		
		sc.close();
	}
}
