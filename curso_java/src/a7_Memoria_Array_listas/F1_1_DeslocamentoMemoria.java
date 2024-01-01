package a7_Memoria_Array_listas;

public class F1_1_DeslocamentoMemoria {
	public static void main(String[] args) {
		method1();
	}

	public static void method1() {
		Product p = method2();
		System.out.println(p);
	}

	public static Product method2() {
		Product prod = new Product("Tv", 900.00, 1);
		return prod;
	}
}
