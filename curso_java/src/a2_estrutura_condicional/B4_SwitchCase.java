package a2_estrutura_condicional;

import java.util.Scanner;

public class B4_SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String dia;
		
		switch (num) {
			case 1:
				dia = "Segunda - Feira";
			break;
			
			case 2:
				dia = "Terça - Feira";
			break;
			
			case 3: 
				dia = "Quarta - Feira";
			break;
			
			case 4:
				dia = "Quinta - Feira";
			break;
			
			case 5:
				dia = "Sexta - Feira";
			break;
			
			case 6:
				dia = "Sábado";
			break;
			
			case 7:
				dia = "Domingo";
			break;
			
			default:
				dia = "Valor inválido";
			break;
		}
		
		System.out.println("O dia é " + dia);
		sc.close();
	}
}
