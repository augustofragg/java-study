package a2_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class B3_AtribuComulativ {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int min;
		double conta = 50.0;
		System.out.print("Digite os minutos: ");
		min = sc.nextInt();
				
		if ( min <= 100) {
			System.out.printf("Valor a pagar R$ %.2f",conta);
			
		} else if (min > 100) {
			//conta = conta + (min - 100) * 2.00;
			conta += (min - 100) * 2.00;
			System.out.printf("Valor a pagar R$ %.2f",conta);
		}
				
		sc.close();
	}
}
