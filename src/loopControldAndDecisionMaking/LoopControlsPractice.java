package loopControldAndDecisionMaking;

public class LoopControlsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//whileLoopExample1();
		//whileLoopExample2();
		//doWhileExample();
		//forLoopExample();
		loginToAmazon();

	}
	
	//Display numbers from 10 to 25
	public static void whileLoopExample1() {
		int number1 = 26;
		
		while (number1 <= 25) {
			System.out.println("The number is: "+ number1);
			number1++;  //number1 = number1+1 --> number1 = 10+1
		}
		System.out.println("********************************************");
	}
	
	//Display even numbers between 1 to 100
	public static void whileLoopExample2() {	
		int number1 = 1;
		
		while (number1 % 2 == 0) {
			while (number1 <= 100) {
				System.out.println("This is an even Number: "+number1);
			}
			number1++;
		}
		System.out.println("This is not an even number :"+ number1);
			
	}
	
	public static void doWhileExample() {
		int number1 = 20;
		do {
			System.out.println("The number is :"+ number1);
			number1++;
		}while (number1 <= 25);
	}
	
	//Display even numbers between 1 to 100
	public static void forLoopExample() {
		
		//for (intialisation;boolean_expression;update)
		for (int number1=1;number1<=100;number1++) {
			int result = number1%2;
			if(result==0) {
				System.out.println("The number is even: "+number1);
			}
		}
		System.out.println("************************");
	}
	
	public static void loginToAmazon() {
		int phoneNumber = 0;
		
		for(int email1=1;email1<=100;email1++) {
			System.out.println("Logged in to the amazon account: harshatest"+email1+"@gmail.com");
			if(phoneNumber ==0) {
				System.out.println("Phone number is not present");
			}
		}
		
	}
	
	


}
