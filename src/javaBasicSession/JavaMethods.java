package javaBasicSession;

import javaPackagesLearning.GlobalVariables;
import javaPackagesLearning.TestCaseStatus;

public class JavaMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*productOfTwoNumbers(255, 100);
		LoginToAmazon("javatest@gmailcom", "test1234");
		addingTwoNumbers();*/
	
		JavaCallingOfMethods javaCallingOfMethods = new JavaCallingOfMethods();
		javaCallingOfMethods.protectedMethod();
		
		System.out.println("The browsers that are supported are:" 
				+ GlobalVariables.browser1 +","+""+GlobalVariables.browser2+","+""+
				GlobalVariables.browser3);
	
	}
	
	public static void addingTwoNumbers() {
		int number1 = 45;
		int number2 = 20;
		int result;
		
		result = number1 + number2;
		System.out.println("The sum of two numbers is: " +result);
		System.out.println(TestCaseStatus.PASS);
		System.out.println("*****************************");
	}
	
	public static int productOfTwoNumbers(int number1, int number2) {
		int product;
		
		product = number1*number2;
		System.out.println("The product of two numbers is:" +product);
		System.out.println(TestCaseStatus.FAIL);
		System.out.println("*****************************");
		return product;
		
	}
	
	public static void LoginToAmazon(String emailID, String password) {
		System.out.println("Entered Email ID: "+ emailID);
		System.out.println("Entered Password: "+ password);
		System.out.println("Clicked on Signin Button");
		
		System.out.println("Logged in to the application successfully !!!");
		System.out.println(TestCaseStatus.SKIPPED);
		System.out.println("*****************************");
	}

}
