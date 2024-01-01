package a1_estrutura_sequencial;

import java.util.Locale;

public class A2_1_SaidaDados {
	public static void main(String[] args) {
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome,idade,renda);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome,idade,renda);
	}
}
