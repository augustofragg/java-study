package a5_intro_orientacaoObjeto;

import java.util.Locale;
import java.util.Scanner;

public class E2_OrienObj_Product {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product a;
		
		System.out.println("Enter Product data: ");
		a = new Product();
		System.out.print("Name: ");
		a.name = sc.nextLine();
		System.out.print("Price: ");
		a.price = sc.nextDouble();
		System.out.print("Quantity in Stock: ");
		a.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data " + a);
		
		System.out.print("Enter the number of products to be added in stock: ");
		a.AddProduct(sc.nextInt());
		sc.nextLine();
		System.out.println();
		System.out.println("Update data " + a);
		
		System.out.print("Enter the number of products to be removed from stock: ");		
		a.RemoveProduct(sc.nextInt());
		sc.nextLine();
		System.out.println();
		System.out.println("Update data " + a);
		
		sc.close();
	}
}
