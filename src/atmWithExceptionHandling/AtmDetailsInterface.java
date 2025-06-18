package atmWithExceptionHandling;

public interface AtmDetailsInterface {

	public static final double accountBalance = 5000;
	
	double withdrawMoney()throws InsufficientBalanceException;
	double depositMoney()throws InvalidAmountException;
	double checkBalance();
	
}
