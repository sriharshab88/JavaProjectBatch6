package ExceptionHandling;

public class ExceptionHandlingPractice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//listOfExceptionMethods();
		tryCatchExample();
	}
	
	public static void listOfExceptionMethods() throws Exception {
		indexOutOfBoundException();
	}
	
	public static void indexOutOfBoundException() throws Exception {
		String items[] = {"Laptop", "Hard drive", "Mouse", "keyboard", "Speakers"};
		Thread.sleep(3000);
		for (int i=0; i<=items.length; i++) {
			System.out.println("The item list contains :"+ items[i]);
			throw new Exception("This exception is thrown by Me");
		}
	}
	
	public static void tryCatchExample() throws InterruptedException {
		try {
			int arrayOfEvenNumbers[] = {2, 4, 8, 12, 14};
			for (int i=0; i<arrayOfEvenNumbers.length;i++) {
			if(arrayOfEvenNumbers[i]%2 == 0) {
				System.out.println("This is an even Number");
			}
			}
			System.out.println("This statement is printed after for loop");
		}catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("This exception has occured because of index out of boundary");
			System.out.println(exc);
		}
		finally {
			System.out.println("This statement is printed in finally block");
		}
		
	}

}
