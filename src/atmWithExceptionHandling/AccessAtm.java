package atmWithExceptionHandling;

public class AccessAtm {

	public static void main(String[] args)throws InvalidPinException, InsufficientBalanceException, InvalidAmountException {
		ATM user = new ATM();
		user.checkPassword();

	}

}
