package e2_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exer5b {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double qtd, value;
		int code = sc.nextInt();
		
		switch (code) {
			case 1: 
				qtd = sc.nextDouble();
				value = qtd * 4.00;
				System.out.printf("Total R$ %.2f",value);
			break;
			
			case 2:
				qtd = sc.nextDouble();
				value = qtd * 4.50;
				System.out.printf("Total R$ %.2f",value);
			break;
			
			case 3:
				qtd = sc.nextDouble();
				value = qtd * 5.00;
				System.out.printf("Total R$ %.2f",value);
			break;
			
			case 4:
				qtd = sc.nextDouble();
				value = qtd * 2.00;
				System.out.printf("Total R$ %.2f",value);
			break;
			
			case 5:
				qtd = sc.nextDouble();
				value = qtd * 1.50;
				System.out.printf("Total R$ %.2f",value);
			break;
				
			default :
				System.out.println("VALOR INVÁLIDO");
			break;

		}
		sc.close();
	}
}
