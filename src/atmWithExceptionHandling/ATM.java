package atmWithExceptionHandling;

import java.util.Scanner;

public class ATM extends AtmDetailsImplementation {
	int pinNumber = 1234;
	double balance;
	public void checkPassword()throws InvalidPinException, InsufficientBalanceException, InvalidAmountException {
		int attempts = 0;
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter Pin Number : ");
			int pin = input.nextInt();
			
			if(pinNumber != pin) {
				System.out.println("Wrong password");
				attempts+=1;
				System.out.println("Only "+(3-attempts)+" attempts available");
				
			}else {
				if(pinNumber == pin) {
					System.out.println("Authorization Successful");
					System.out.println();
					showDetails();
				}
			}
			
		}while(attempts<3);
		
		
		//throw a exception if 
		throw new InvalidPinException("You entered 3 wrong pins! Try again tomorrow ");
		
	}
	
	public void showDetails() throws InsufficientBalanceException, InvalidAmountException {
		Scanner input = new Scanner(System.in);
		
		int choice;
		System.out.println("Option 1 : Withdraw money");
		System.out.println("Option 2 : Deposit money");
		System.out.println("Option 3 : Check balance");
		System.out.println("Option 4 : Exit");
		
		
		do {
		System.out.println("Enter your choice : ");
		choice = input.nextInt();
		
		System.out.println("Option 1 : Withdraw money");
		System.out.println("Option 2 : Deposit money");
		System.out.println("Option 3 : Check balance");
		System.out.println("Option 4 : Exit");
		
		switch(choice) {
		case 1:
			System.out.println("Option 1 : Withdraw money");
			System.out.println("Option 2 : Deposit money");
			System.out.println("Option 3 : Check balance");
			System.out.println("Option 4 : Exit");
			System.out.println();
			System.out.println();
			
			balance  = withdrawMoney();
			System.out.println(withdrawlAmount+" rs withdrawl  succesfull");
			
			System.out.println("Your new balance is : "+balance);
			
			break;
		case 2:
			System.out.println("Option 1 : Withdraw money");
			System.out.println("Option 2 : Deposit money");
			System.out.println("Option 3 : Check balance");
			System.out.println("Option 4 : Exit");
			System.out.println();
			System.out.println();
			balance = depositMoney();
			System.out.println(depositAmount+" rs deposited successfully");
			System.out.println(" Your new balance "+balance);
			
			break;
		case 3:
			System.out.println("Option 1 : Withdraw money");
			System.out.println("Option 2 : Deposit money");
			System.out.println("Option 3 : Check balance");
			System.out.println("Option 4 : Exit");
			System.out.println();
			System.out.println();
			System.out.println("Balance : "+checkBalance());
			
			break;
		case 4:
			System.out.println("Option 1 : Withdraw money");
			System.out.println("Option 2 : Deposit money");
			System.out.println("Option 3 : Check balance");
			System.out.println("Option 4 : Exit");
			System.out.println();
			System.out.println();
			System.out.println(" Exit ");
			break;
		default:
			System.out.println(" Invalid choice! Enter a valid choice from 1 to 4 ");
		}
		}while(choice !=4);
				
	}


}
