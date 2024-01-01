package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println("Tamanho da lista: " + list.size());
		
		for(String vasculh : list) {
			System.out.println(vasculh);
		}
		System.out.println("----------------");
		list.remove("Anna");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String vasculh : list) {
			System.out.println(vasculh);
		}
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println("-----------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Bob: " + list.indexOf("Marco"));
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		System.out.println("---------");
		for(String vasculha : result) {
			System.out.println(vasculha);
		}
		System.out.println("----------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);
		System.out.println(name);
		sc.close();
	}
	
}
