package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char sex;
		int quantBeers, quantSoftDrinks, quantbarbecues;
		Bill bill;
		
		System.out.print("Sex: ");
		sex = Character.toUpperCase(sc.next().charAt(0));
		while(sex != 'F' && sex != 'M') {
			System.out.print("input error. Type 'F' or 'M': ");
			sex = Character.toUpperCase(sc.next().charAt(0));
		}
		System.out.print("quantity of beers: ");
		quantBeers = sc.nextInt();
		System.out.print("quantity of soft drinks: ");
		quantSoftDrinks = sc.nextInt();
		System.out.print("quantity of quantbarbecues: ");
		quantbarbecues = sc.nextInt();
		
		bill = new Bill(sex, quantBeers, quantSoftDrinks, quantbarbecues);
		
		System.out.println("\nREPORT:");
		System.out.printf("Consumption = BRL %.2f%n", bill.feeding());
		if(bill.cover() == 0.0) {
			System.out.println("Coverage exempt");
		} else {
			System.out.printf("Coverage = BRL %.2f%n", bill.cover());
		}
		System.out.printf("Ticket = BRL %.2f%n", bill.ticket());
		
		System.out.printf("%nAmount payable = BRL %.2f%n", bill.total());
		
		sc.close();
	}

}
