package a2_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class B5_condicionalTernario {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double preco = sc.nextDouble();
		double desconto;
		
		if(preco < 20.00) {
			desconto = preco * 0.1;
			System.out.println(desconto);
			
		}else {
			desconto = preco * 0.05;
			System.out.println(desconto);
		}
		
		double desconto2 = (preco < 20.00) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto2);
		
		sc.close();
	}
}
