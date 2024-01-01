package a6_Constructor_This_SobreCarga_Encapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class d2_encapsulamento {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product data ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		System.out.println();
		
		Productb p = new Productb(name,price,quantity);
		
		System.out.println("Product data: " + p);
		
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		p.addProduct(quantity);
		System.out.println();
		
		System.out.println("Updated: " + p);
		
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		sc.nextLine();
		p.RemovProduct(quantity);
		System.out.println();
		
		System.out.println("Updated: " + p);
		
		System.out.print("Model: ");
		String model = sc.nextLine();
		System.out.print("Size: ");
		int size = sc.nextInt();
		System.out.println();
		
		p = new Productb(model,size);
		
		System.out.println("Tv model: " + p.getModel() + " - - Tv Size: " + p.getSize());
		
		
		sc.close();
	}
}
