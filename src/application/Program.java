package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;
import entities.Individual;
import entities.Company;
 

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #"+i+" data:");
			System.out.print("Individual or company (i/c)?");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			//sc.nextLine();
			String name = sc.next();//se for nextInt, deverá por sc.nextLine uma linha antes.
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			
			if(type == 'i') {
				
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				
				list.add(new Individual(name, anualIncome, health));
			}
			else {
				System.out.println("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for (TaxPayer p : list) {
			System.out.println(p.getName() +": $ "+ String.format("%.2f", p.tax()));
		}

		double sum = 0.0;		
		for (TaxPayer soma : list) {
			sum += soma.tax();	
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
				
	}
		

}
