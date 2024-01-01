package e1_estrutura_sequancial;

import java.util.Locale;
import java.util.Scanner;

public class Exer4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int l_h,num;
		double salary, v_h;
		
		num = sc.nextInt();
		l_h = sc.nextInt();
		v_h = sc.nextDouble();
		
		salary = l_h * v_h;
		
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f",num,salary);
		
		
		sc.close();
	}
}
