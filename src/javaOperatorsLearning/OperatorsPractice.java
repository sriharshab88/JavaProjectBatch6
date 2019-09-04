package javaOperatorsLearning;

public class OperatorsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arithmeticOperations(30,5, 7.4F, 5.2F);
		//relationalOperations(34.8, 74.9);
		//relationalOperations(99.43, 67.32);
		logicalOperations(25, 35);
	}
	
	public static void arithmeticOperations(int number1, int number2, float number3, float number4) {
		int sum = number1 + number2;
		float sum2 = number3 + number4;
		System.out.println("The Sum of two numbers :" + sum);
		System.out.println("The Sum of two floating numbers :" + sum2);
		int difference = number1 - number2;
		System.out.println("The difference between two numbers: "+ difference);
		int product = number1 * number2;
		System.out.println("The product of two numbers: "+ product);
		int quotient = number1 / number2;
		System.out.println("The quotient of two numbers: "+ quotient);
		int remainder = number1 % number2;
		System.out.println("The remainder of two numbers: "+ remainder);
		System.out.println("*************************************************");
		System.out.println("The value of a number1: "+ number1);
		number1++;  // number1 = number1+1 --> number1 = 30+1 -> 31
		System.out.println("The first increment of a number1: "+ number1);
		number1++;  //number1 = 31+1 -> 32
		System.out.println("The second increment of a number1: "+ number1);
		System.out.println("The final value of a number1: "+ number1);
		System.out.println("*************************************************");
		System.out.println("The value of a number2: "+ number2);
		number2--; //number2 = number2-1 --> number2 = 5-1 -> 4
		System.out.println("The first decrement of a number2: "+ number2);
		number2--; //number2 = 4-1 -> 3
		System.out.println("The second decrement of a number2: "+ number2);
		System.out.println("The final value of a number2: "+ number2);
		
	}
	
	public static void relationalOperations(double number1, double number2) {
		boolean comparisionResult = number1 == number2;
		System.out.println("The result of Equal to Comparision bewteen 2 numbers: " + comparisionResult);
		boolean negationResult = number1 != number2;
		System.out.println("The result of Negation bewteen 2 numbers: " + negationResult);
		boolean greaterThanResult = number1 > number2;
		System.out.println("The result of Greater than bewteen 2 numbers: " + greaterThanResult);
		boolean lessThanResult = number1 < number2;
		System.out.println("The result of Less than bewteen 2 numbers: " + lessThanResult);
		boolean greaterThanOrEqualToResult = number1 >= number2;
		System.out.println("The result of Greater than or equal to bewteen 2 numbers: " 
								+ greaterThanOrEqualToResult);
		boolean lessThanOrEqualToResult = number1 <= number2;
		System.out.println("The result of Less than or equal to bewteen 2 numbers: " 
								+ lessThanOrEqualToResult);
		System.out.println("*************************************************");
	}
	
	
	public static void logicalOperations(int number1, int number2) {
		
		boolean value1 = number1 > number2;
		boolean value2 = number1 <= number2;
		
		System.out.println("The boolean result of value1: "+ value1);
		System.out.println("The boolean result of value2: "+ value2);
		System.out.println("The logical AND Operation is: "+ (value1 && value2));
		System.out.println("The logical NOT Operation is: "+ !(value1 && value2));
		System.out.println("******************************************************");
		System.out.println("The boolean result of value1: "+ value1);
		System.out.println("The boolean result of value2: "+ value2);
		System.out.println("The logical OR Operation is: "+ (value1 || value2));
		System.out.println("The logical NOT Operation is: "+ !(value1 || value2));	
	}
	

}
