package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		double twenty = 0;
		double ten = 0;
		double five = 0;
		double one = 0;
		double quarter = 0;
		double dime = 0;
		double nickel = 0;
		double penny = 0;

		Scanner kb = new Scanner(System.in);
		System.out.println("What is the price of your item? ");
		double price = kb.nextDouble();
		System.out.println("What is the amount tendered? ");
		kb.nextLine();
		double tendered = kb.nextDouble();
		double change = (tendered + .00005) - price; 
		
		int numOf20s = (int) change / 20;
		int numOf10s = (int) change / 10;
		int numOf5s = (int) change / 5;
		int numOf1s = (int) change / 1;
		double numOfQs = (int) (change / .25);
		double numOfDs = (int) (change / .1);
		double numOfNs = (int) (change / .05);
		double numOfPs = (int) (change / .01);
		
		if (price == tendered) {
			System.out.println("you have provided the exact amount, thank you for coming and have a great day! ");
			
		}
	while (tendered < price)	
		if (tendered < price) {
			System.out.println("the amount you have given is not enough, please provide enough money for your item");
			System.out.println("What is the price of your item? ");
			price = kb.nextDouble();
			System.out.println("What is the amount tendered? ");
			kb.nextLine();
			tendered = kb.nextDouble();
			change = (tendered + .00005) - price; 
		} 
		

	
	System.out.println("Your change is: ");
		
	while (change > 0) {
			
			if ((int) change / 20 > 0) {
				numOf20s = (int) change / 20;
				System.out.print(numOf20s + " twenty(s), ");
				change -= numOf20s * 20;
			} else if ((int) change / 10 > 0) {
				numOf10s = (int) change / 10;
				System.out.print(numOf10s + " ten(s), ");
				change -= numOf10s * 10;
			} else if ((int) change / 5 > 0) {
				numOf5s = (int) change / 5;
				System.out.print(numOf5s + " five(s), ");
				change -= numOf5s * 5;
			} else if ((int) change / 1 > 0) {
				numOf1s = (int) change / 1;
				System.out.print(numOf1s + " one(s), ");
				change -= numOf1s;
			} else if (change > .25) {
				numOfQs = (int) (change / .25);
				System.out.print(numOfQs + " quarter(s), ");
				change -= numOfQs * (.25);
			} else if (change > .1) {
				numOfDs = (int) (change / .1);
				System.out.print(numOfDs + " dime(s), ");
				change -= numOfDs * (.1);
			} else if (change > .05) {
				numOfNs = (int) (change / .05);
				System.out.print(+ numOfNs + " nickel(s) ");
				change -= numOfNs * (.05);
			} else if (change > .01) {
				numOfPs = (int) (change / .01);
				System.out.print(+ numOfPs + " pennie(s)");
				change -= numOfPs;
			}

		}
		
		
	}

	public static void customerPrompt() {
		
		
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the price of your item? ");
		double price = kb.nextDouble();
		System.out.println("What is the ammount tendered? ");
		double tendered = kb.nextDouble();
		double change = (tendered + .00005) - price; 
		
		int numOf20s = (int) change / 20;
		int numOf10s = (int) change / 10;
		int numOf5s = (int) change / 5;
		int numOf1s = (int) change / 1;
		
		
		while (change > 0) {
			
			if ((int) change / 20 > 0) {
				numOf20s = (int) change / 20;
				System.out.print(numOf20s + " twenty(s), ");
				System.out.println(change);
				change -= numOf20s * 20;
			} else if ((int) change / 10 > 0) {
				numOf10s = (int) change / 10;
				System.out.print(numOf10s + " ten(s), ");
				change -= numOf10s * 10;
			} else if ((int) change / 5 > 0) {
				numOf5s = (int) change / 5;
				System.out.print(numOf5s + " five(s), ");
				change -= numOf5s * 5;
			} else if ((int) change / 1 > 0) {
				numOf1s = (int) change / 1;
				System.out.print(numOf1s + " one(s), ");
				change -= numOf1s;
			} else if (change > .25) {
				double numOfQs = (int) (change / .25);
				System.out.print(numOfQs + " quarters(), ");
				change -= numOfQs * (.25);
			} else if (change > .1) {
				double numOfDs = (int) (change / .1);
				System.out.print(numOfDs + " dime(s), ");
				change -= numOfDs * (.1);
			} else if (change > .05) {
				double numOfNs = (int) (change / .05);
				System.out.print(numOfNs + " nickel(s) ");
				change -= numOfNs * (.05);
			} else if (change > .01) {
				double numOfPs = (int) (change / .01);
				System.out.print(numOfPs + " pennie(s).");
				change -= numOfPs;
			}

		}
	}
	
}
