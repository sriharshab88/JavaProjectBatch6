package loopControldAndDecisionMaking;

public class DecisionMakingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//nestedIfExample();
		ifElseIfExample();
	}
	
	public static void nestedIfExample() {
		int number1 = 16;
		int number2 = 12;
		
		if(number1<15) {
			System.out.println("The number is less than 15: "+number1);
			if(number2>18) {
				System.out.println("The number is greater than 18: "+number2);
			}
		}
	}
	
	public static void ifElseIfExample() {
		int number1 = 25;
		if(number1< 15) {
			System.out.println("The number is less than 15");
		}else if(number1>20) {
			System.out.println("The numberis greater than 20");
		}else if(number1>30) {
			System.out.println("The number is greater than 30");
		}
	}

}
