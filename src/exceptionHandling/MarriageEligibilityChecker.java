package exceptionHandling;

import java.util.Scanner;

public class MarriageEligibilityChecker {

	public static void eligibilityCheck(int age)throws tooYoungException, tooOldException {
		if(age < 18) {
			throw new tooYoungException("You are a Minor, You are not eligible for marriage!");
		}else {
			if(age > 60) {
				throw new tooOldException("You are too old to marriage, You are not eligible for marriage");
			}else {
				System.out.println("These are the matches choose perfect match");
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age =  input.nextInt();
		
		try {
			eligibilityCheck(age);
		} catch (tooYoungException | tooOldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//this method prints exception name, description, and error location
			//getmessage()
			//toString() method
			
			input.close();
		}

	}

}
