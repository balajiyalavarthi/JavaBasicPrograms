package atmWithExceptionHandling;

import java.util.Scanner;

public class AtmDetailsImplementation implements AtmDetailsInterface {

	double newBalance;
	double withdrawlAmount;
	double depositAmount;
	@Override
	public double withdrawMoney() throws InsufficientBalanceException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Amount to withdraw : ");
		withdrawlAmount = input.nextDouble();
		newBalance = accountBalance;
		newBalance = withdrawlAmount <=accountBalance && withdrawlAmount% 100 == 0?accountBalance-withdrawlAmount:-1;
		
		if(newBalance < 0) {
			throw new InsufficientBalanceException("withdraw amount cannot be more than account balance and withdrawl amount must be divided by 100");
		}
		
		return newBalance;
	}

	@Override
	public double depositMoney()throws InvalidAmountException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount to deposit : ");
		depositAmount = input.nextDouble();
		
		newBalance = (depositAmount>= 0) && (depositAmount% 100== 0)?newBalance+depositAmount: -1;
		
		if(newBalance < 0) {
			throw new InvalidAmountException("Withdrawl amount must be greater than 0 or multiples of 100");
		}
		return newBalance;
	}

	@Override
	public double checkBalance() {
		return newBalance;
	}

}
