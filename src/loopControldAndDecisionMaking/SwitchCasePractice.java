package loopControldAndDecisionMaking;

public class SwitchCasePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//purchaseElectronicItems("JBL Speakers");
		simpleCalculator(5, 45, 10);
	}
	
	public static void purchaseElectronicItems(String itemName) {
		switch (itemName) {
		case "LED TV":
			System.out.println("Purchased Samsung LED TV 42 inch");	
			break;
			
		case "Laptop":
			System.out.println("Purchased Dell Laptop of i7 Processor");	
			break;
			
		case "Keyboard":
			System.out.println("Purchased Dell Keyboard");	
			break;
			
		case "Mouse":
			System.out.println("Purchased iBall Mouse");	
			break;
			
		case "Speakers":
			System.out.println("Purchased JBL Speakers");	
			break;

		default:
			System.out.println("Did not find any items");
			break;
		}
	}
	
	
	public static void simpleCalculator(int operation, int number1, int number2) {
		int result = 0;
		
		switch (operation) {
		case 1:
			result = number1+number2;
			System.out.println("The result of the addition operation is : "+result);
			break;
			
		case 2:
			result = number1-number2;
			System.out.println("The result of the subtraction operation is : "+result);
			break;
			
		case 3:
			result = number1*number2;
			System.out.println("The result of the product operation is : "+result);
			break;
			
		case 4:
			result = number1/number2;
			System.out.println("The result of the division operation is : "+result);
			break;
			
		case 5:
			result = number1%number2;
			System.out.println("The result of the modulus operation is : "+result);
			break;

		default:
			System.out.println("Operation specified does not exist");
			break;
		}
	}

}
