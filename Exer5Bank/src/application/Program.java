package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account c;
		
		System.out.print("Enter account: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
				
		System.out.print("Is there na initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		if(resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			 c = new Account(number,name,sc.nextDouble());
		}else {
			 c = new Account(number,name);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(c);
		
		System.out.print("Enter a deposit value: ");
		c.DepositValue(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(c);
		
		System.out.print("Enter a withdraw value: ");
		c.WithdrawValue(sc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(c);
		sc.close();
	}
}
