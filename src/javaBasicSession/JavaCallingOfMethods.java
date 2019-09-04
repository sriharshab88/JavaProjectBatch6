package javaBasicSession;

import ExceptionHandling.ExceptionHandlingPractice;
import javaPackagesLearning.AccessModifiersPractice;

public class JavaCallingOfMethods extends AccessModifiersPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	JavaMethods javaMethods = new JavaMethods();
		javaMethods.addingTwoNumbers(); //calling of non-static methods by creating an instance
		
		int multipliedResult = JavaMethods.productOfTwoNumbers(10, 5); //calling of static methods by using classname
		
		int sum = multipliedResult + 25;
		System.out.println("The total sum of the operation is: "+ sum);
		
		AccessModifiersPractice accessModifiersPractice = new AccessModifiersPractice();*/
		
		ExceptionHandlingPractice exceptionHandlingPractice = new ExceptionHandlingPractice();
		//ExceptionHandlingPractice.listOfExceptionMethods();
		
		
		
		
//		JavaMethods.LoginToAmazon("harsha1@gmail.com", "123456");
//		JavaMethods.LoginToAmazon("harsha2@gmail.com", "1234567");
//		JavaMethods.LoginToAmazon("harsha3@gmail.com", "1234563");
//		JavaMethods.LoginToAmazon("harsha4@gmail.com", "1234566");
//		JavaMethods.LoginToAmazon("harsha5@gmail.com", "1234562");
		
	}
	
	public void protectedMethod() {
		this.protectedModifierExample();
	}

}
