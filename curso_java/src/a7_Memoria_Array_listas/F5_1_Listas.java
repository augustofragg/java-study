package a7_Memoria_Array_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class F5_1_Listas {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2,"Marco");
		
		for(String vascu : list) {
			System.out.println(vascu);
		}
		
		System.out.println("---------");
		
		List<String> result = list.stream()
				.filter(x -> x.charAt(0) == 'M')
				.collect(Collectors.toList());
		
		for (String vascu : result) {
			System.out.println(vascu);
		}
		System.out.println("---------");
		
		String name = list.stream()
				.filter(x -> x.charAt(0) == 'A')
				.findFirst().orElse(null);
		
		System.out.println(name);
	}
}
