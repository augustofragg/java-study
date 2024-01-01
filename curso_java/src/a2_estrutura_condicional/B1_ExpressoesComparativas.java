package a2_estrutura_condicional;

import java.util.Scanner;

public class B1_ExpressoesComparativas {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int a,b,c;
		 boolean d1, d2, d3, d4;
		 
		 a = sc.nextInt();
		 b = sc.nextInt();
		 c = sc.nextInt();
		 
		 d1 = a > b;
		 d2 = a <= b;
		 d3 = a == b;
		 d4 = a != b;
		 
		 System.out.println(d1);
		 System.out.println(d2);
		 System.out.println(d3);
		 System.out.println(d4);
		 
		 d1 = ((a>b) && (a == c));
		 d2 = ((a>b) || (a == c));
		 d3 = !((a>b) || (a == c));
		 
		 System.out.println(d1);
		 System.out.println(d2);
		 System.out.println(d3);
		 
		 sc.close();
	}
}
