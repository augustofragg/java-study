package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		

		for(int i = 0;i < N; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id,name,salary);
			list.add(emp);
		}
		System.out.println();
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		Integer pos = hasId(list,idsalary); 
		
		if(pos == null) {
			System.out.print("This id does not exist!");
			System.out.println();
		}else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(pos).increaseSalary(percentage);
		}
		System.out.println();
		
		System.out.println("List of employees: ");
		for(Employee vascu : list) {
			System.out.println(vascu);
		}
		
		sc.close();
		
	}
	
	public static Integer hasId(List<Employee> list,int id) {
		for(int i = 0;i < list.size();i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}