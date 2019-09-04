package oopsInheritanceConcepts;

public class mathematicalOperations extends productOfTwoNumbers{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition(100, 234);
	}
	
	public static void addition(int number1, int number2) {
		int sum = number1 + number2;
		System.out.println("The addition of two numbers is: "+sum);
		int totalResult = sum + product(24, 10);
		System.out.println("The total result is: "+totalResult);
	}

}
