package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char sex;
		int quantBeers, quantSoftDrinks, quantbarbecues;
		
		System.out.print("Sex: ");
		sex = sc.next().charAt(0);
		System.out.print("quantity of beers: ");
		quantBeers = sc.nextInt();
		System.out.print("quantity of soft drinks: ");
		quantSoftDrinks = sc.nextInt();
		System.out.print("quantity of skewers: ");
		quantbarbecues = sc.nextInt();
		
		System.out.println("\nREPORT:");
		System.out.printf("Consumption = BRL %.2f%n",);
		System.out.printf("Coverage = BRL %.2f%n",);
		System.out.printf("Ticket = BRL %.2f%n",);
		
		System.out.printf("%nAmount payable = BRL %.2f%n",);
		
		sc.close();
	}

}
