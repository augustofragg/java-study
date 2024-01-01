package e2_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exer8b {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salary, tax;
		salary = sc.nextDouble();
		
		if((0.00 <= salary) && (salary <= 2000.00)) {
			System.out.println("Isento");
			
		}else if((2000.01 <= salary) && (salary <= 3000.00)) {
			tax = (salary - 2000) * 1.08;
			System.out.printf("R$ %.2f%n",tax);
		
		}else if((3001.01 <= salary) && (salary <= 4500.00)) {
			tax = (1000.00 * 0.08) + ((salary - 3000) * 0.18);
			System.out.printf("R$ %.2f%n",tax);
			
		}else if(4500.01 < salary) {
			tax = (1000 * 0.08) + (1500 * 0.18) + ((salary - 4500) * 0.28);
			System.out.printf("R$ %.2f%n",tax);
		}
		
		
		
		sc.close();
	}
}
