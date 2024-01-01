package a7_Memoria_Array_listas;

public class F1_0_Memoria {
	public static void main(String[] args) {
		
		Product p1 = new Product("Tv",900.0,10);
		Product p2 = new Product("Moto",500.00,1);
		Product p3 = new Product();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println();
		
		p2 = p1;
		System.out.println("Apos p2 = p1, p2 armazena o endereço na memoria de p2");
		System.out.println(p2);
		System.out.println();
		
		System.out.println(p3);
		
	}
}
