package ExceptionHandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		try {
			System.out.print("Statement 1 ");
			System.out.print("Statement 2 ");
			System.out.print("Statement 3 ");
			

			try {// inner

				System.out.print("Statement 4 ");
				System.out.print("Statement 5 ");
				System.out.print("Statement 6 ");

			} catch (ArithmeticException e) {// inner catch

				System.out.print(10/0);
				System.out.print("Statement 8");
				System.out.print("Statement 9");

			} finally {// inner finally
				System.out.println("Statement 10");
			}

		} catch (ArithmeticException e) {
			System.out.print("Statement 11");
			System.out.print("Statement 12");
			System.out.print("Statement 13");
		} finally {

			System.out.print("Statement 14");
		}

	}

}


/*
 * case 1: if there is no exception then the output is 1, 2, 3, 4, 5, 6, 10, 14
 * case 2: if ther is a exceptions in outer try block then the output is  1, 11, 12, 13, 14
 * case 3: if there is a exception in inner try block then the output is 1,2,3,4,7,8,9,10,14
 * case 4: if there is a exception in outer catch block then the output is 
 * Statement 1
Statement 2
Statement 3
Statement 4
Statement 5
Statement 6
Statement 10
Statement 14

case 5  : if there is exception in inner catch block then the output is Statement 1Statement 2Statement 3Statement 4Statement 5Statement 6Statement 10
Statement 14

case 6 : if there is exception in both inner and outer try blocks then the output is Statement 1 Statement 2 Statement 11Statement 12Statement 13Statement 14
case 7 : if ther is exception in both catch blocks then the output is Statement 1 Statement 2 Statement 3 Statement 4 Statement 5 Statement 6 Statement 10
Statement 14
case 8 : if there is exception in outer finally block then the output is Statement 1 Statement 2 Statement 3 Statement 4 Statement 5 Statement 6 Statement 10
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionHandling.NestedTryCatch.main(NestedTryCatch.java:34)
case 9 : Statement 1 Statement 2 Statement 3 Statement 4 Statement 5 Statement 6 Statement 14Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionHandling.NestedTryCatch.main(NestedTryCatch.java:29)
case 10 : if there is a exception in both inner and outer finally blocks then the output is Statement 1 Statement 2 Statement 3 Statement 4 Statement 5 Statement 6 Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionHandling.NestedTryCatch.main(NestedTryCatch.java:34)
case 11 : if there is a exception in inner try and inner catch block then the output is 

 */
