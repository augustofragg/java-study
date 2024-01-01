package a7_Memoria_Array_listas;

import java.util.ArrayList;
import java.util.List;

public class F5_0_Listas {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2,"Marco");
		
		for(String vasc : list) {
			System.out.println(vasc);
		}
		
		System.out.println("Index of bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		System.out.println("Tamanho da lista: " + list.size());
		
		System.out.println("-----------");
		
		list.remove("Anna");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String vasc : list) {
			System.out.println(vasc);
		}
		
	}
}
