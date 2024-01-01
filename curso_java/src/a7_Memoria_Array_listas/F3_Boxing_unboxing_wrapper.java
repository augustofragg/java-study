package a7_Memoria_Array_listas;

public class F3_Boxing_unboxing_wrapper {
	public static void main(String[] args) {
		//Boxing
		int x = 2;
		
		Object obj = x;
		
		//Unboxing
		int y = (int)obj;
		
		Integer a = 5;
		
		int b = a * 2;
		
		System.out.println(obj);
		System.out.println(y);
		
		System.out.println(b);
	}
}
