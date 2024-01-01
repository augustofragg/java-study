package a2_estrutura_condicional;

import java.util.Scanner;

public class B2_1_EstruturaCondicional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.print("Que horas são: ");
		hora = sc.nextInt();
		
		
		if( hora < 12) {
			System.out.println("Bom Dia !");
			
		}else if ((hora >= 12)&& (hora < 18) ) {
			System.out.println("Boa Tarde !");
			
		}else {
			System.out.println("Boa Noite !");
		}
		
		sc.close();
	}
}
