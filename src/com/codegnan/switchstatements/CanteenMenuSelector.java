package com.codegnan.switchstatements;

import java.util.Scanner;
//Canteen app
public class CanteenMenuSelector {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int coffeequantity = 0;
		int teaquantity = 0;
		int samosaquantity = 0;
		int quantity;
		int choice;
		byte itemChoice;
		double cofeePrice = 25;
		double coffeeBill = 0;
		double teaPrice = 15;
		double teaBill = 0;
		double samosaPrice = 30;
		double samosaBill = 0;
		double totalBill;
		double tax;
		double totalTaxBill;
		
		//main loop (end user selects options in the canteen)
		
			System.out.println("**********************************************");
			System.out.println("          CHOOSE OPTIONS IN CANTEEN             ");
			System.out.println("**********************************************");
//			System.out.println();
			System.out.println("----------------1.View Menu---------------");
			System.out.println("---------------2. Order items---------------");
			System.out.println("----------------3. View bill---------------");
			System.out.println("------------4. CheckOut and Exit-------------");
			System.out.println();
			System.out.println("**********************************************");
			System.out.println();
			do {
			System.out.println("Enter your choice : ");
			choice = input.nextInt();

			switch (choice) {

			// To select the main menu

			case 1:
				// showing canteen menu
				System.out.println("--Canteen Menu--");
				System.out.println("*****************");
				System.out.println("1.Coffee - 25rs");
				System.out.println("2.Tea - 15rs");
				System.out.println("3.Samosa - 30rs");
				System.out.println("*****************");
				System.out.println("To order the items please enter choice number 2.");
				System.out.println();
				System.out.println();
				break;

			case 2:
				// end user selects the items in the menu
				do {

					System.out.println("For coffee enter 1");
					System.out.println("For tea enter 2");
					System.out.println("For samosa enter 3");
					System.out.println("For exit enter 4");
					System.out.println();
					System.out.println("Enter Item Choice : ");
					itemChoice = input.nextByte();

					switch (itemChoice) {
					case 1:
						// Coffee
						System.out.println("Coffee selected!");
						System.out.println("enter number of quantity you want : ");
						coffeequantity = input.nextInt();
						coffeeBill = cofeePrice * coffeequantity;
						System.out.println(+coffeequantity + " coffee are added!");
						break;

					case 2:
						// Tea
						System.out.println("Tea selected!");
						System.out.println("enter number of quantity you want : ");
						teaquantity = input.nextInt();
						teaBill = teaPrice * teaquantity;
						System.out.println(+teaquantity + " Tea are added!");
						break;

					case 3:
						// Samosa
						System.out.println("Samosa selected!");
						System.out.println("enter number of quantity you want : ");
						samosaquantity = input.nextInt();
						samosaBill = samosaPrice * samosaquantity;
						System.out.println(+samosaquantity + " samosa are added!");
						break;
					case 4:
						// exit from item choice
						System.out.println("Items selected successfully");
						System.out.println("For bill details please choose option 3");
						System.out.println("Enter you choice : ");
						choice = input.nextInt();
						
					default:
						// If user not selects the valid options then this statement executes.
						System.out.println("No Item found please select from (1-3)");
						break;
					}
				} while (itemChoice != 4);

			case 3:
				// Bill calculation
				
				System.out.println();
				System.out.println("-------------------------------------------");
				System.out.println("                   Bill                    ");
				System.out.println("-------------------------------------------");
				System.out.println("Ordered items  ");
				System.out.println();
				System.out.println("coffee :x"+coffeequantity+" added");
				System.out.println("tea    :x"+teaquantity+" added");
				System.out.println("samosa :x"+samosaquantity+" added");
				System.out.println();
				
				quantity = coffeequantity+teaquantity+samosaquantity;
				
				
				System.out.println("Total items ordered: "+quantity+" items");
				System.out.println("*******************************");
				System.out.println("1. Coffee bill : " + coffeeBill);
				System.out.println("2. Tea bill : " + teaBill);
				System.out.println("3. Samosa bill : " + samosaBill);
				System.out.println("*******************************");
				System.out.println();
				totalBill = coffeeBill + teaBill + samosaBill;
				System.out.println("Your bill : " + totalBill);
				tax = totalBill * 0.05;
				System.out.println("tax amount(5% on bill) : " + tax);
				totalTaxBill = totalBill + tax;
				System.out.println("Total bill : " + totalTaxBill);
				System.out.println("                Thank you             ");
				System.out.println("-------------------------------");
				break;

			case 4:
				// Exit
				System.out.println("Thanks for coming! Hava a nice day.");
				return;

			default:
				// if end user does not selected the valid options then this statement executes.
				System.out.println("Invalid choice! please select a valid option from (1-4)");
				break;
			}
		} while (choice != 5);
		input.close();
	}

}

