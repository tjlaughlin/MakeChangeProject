package makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		double twenty = 20.0;
		double ten = 10.0;
		double five = 5.0;
		double one = 1.0;
		double quarter = .25;
		double dime = .1;
		double nickel = .05;
		double penny = .01;

		Scanner kb = new Scanner(System.in);
		System.out.println("What is the price of your item? ");
		double price = kb.nextDouble();
		System.out.println("What is the ammount tendered? ");
		double tendered = kb.nextDouble();

		double change = tendered - price;

		if (tendered < price) {
			System.out.println("the amount you have given is not enough, please provide enough money for your item");
			customerPrompt();
			} else if (tendered == price) {
				System.out.println("you have provided the exact amount, thank you for coming and have a grat day! ");
			}
			
//				int numOf20s = (int) change / 20;
//				int numOf10s = (int) change / 10;
//				int numOf5s = (int) change / 5;
//				int numOf1s = (int) change / 1;
//				
				
				
			while (tendered > 0) {	
		
			if ((int) change / 20 > 0) {
				int numOf20s = (int) change / 20;
				System.out.print("your change will be " + numOf20s + " twentys, ");
				change -= numOf20s * 20;
			} else if ((int) change / 10 > 0) {
				int numOf10s = (int) change / 10;
				System.out.print("your change will be " + numOf10s + " tens, ");
				change -= numOf10s * 10;
			} else if ((int) change / 5 > 0) {
				int numOf5s = (int) change / 5;
				System.out.print("your change will be " + numOf5s + " fives, ");
				change -= numOf5s * 5;
			} else if ((int) change / 1 > 0) {
				int numOf1s = (int) change / 1;
				System.out.print("your change will be " + numOf1s + " ones, ");
				change -= numOf1s;
			} else if (change > .25 ) {
				double numOfQs = (int) (change / .25);
				System.out.print("your change will be " + numOfQs + " quarters, ");
				change -= numOfQs * (.25);
			} 
			else if (change > .1) {
				double numOfDs = (int) (change / .1);
				System.out.print("your change will be " + numOfDs + " dimes, ");
				change -= numOfDs * (.1);
			} 
			else if (change > .05) {
				double numOfNs = (int) (change / .05);
				System.out.println("your change will be " + numOfNs + " nickels");
				change -= numOfNs * (.05);
			} 
			else if (change > .01) {
				double numOfPs = (int) (change / .01);
				System.out.println("your change will be " + numOfPs + " pennies.");
				change -= numOfPs;
				}
		
			}
	}
	
//	System.out.println(numOf20s + numOf10s + numOf5s + numOf1s + numOfQs + numOfDs + numOfNs + numOfPs);

	public static void customerPrompt() {
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the price of your item? ");
		double price = kb.nextDouble();
		System.out.println("What is the ammount tendered? ");
		double tendered = kb.nextDouble();

	}
	}

