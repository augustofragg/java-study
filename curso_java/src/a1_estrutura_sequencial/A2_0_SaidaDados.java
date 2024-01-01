package a1_estrutura_sequencial;

import java.util.Locale;

public class A2_0_SaidaDados {
	public static void main(String[] args) {
		
		//saida de dados simples
		System.out.print("Bom dia \n");
		System.out.println("Bom dia");
		
		//conteudo de variavel com ponto flutuante
		int y = 32;
		double x = 10.35784;
		System.out.println(y);
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
		
		//Concatenção de elementos em um mesmo comando de escrita
		System.out.println("Resultado " + x + " Metros");
		
		System.out.printf("RESULTADO = %.2f metros%n",x);
		
		
	}
}
