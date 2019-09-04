package constructorConceptsLearning;

public class AmazonSitePractice {
	
	public AmazonSitePractice() {
		System.out.println("Launched the Chrome browser successfully");
		System.out.println("Entered Amazon URL in the chrome browser");
		System.out.println("Amazon site loaded without any issues");
		System.out.println("*****************************************");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		orderSubmitFlowInAmazon();
	}
	
	//Test Case #1
	public static void orderSubmitFlowInAmazon() {
		System.out.println("This is Test Case #1");
		loginToAmazon();
		selectItemAndPurchase();
		logout();
	}
	//Test Case #2
	public static void loginFlowInAmazon() {
		System.out.println("This is Test Case #2");
		loginToAmazon();
		logout();
	}
	//Test Case #3
	public static void itemSelectionFlowInAmazon() {
		System.out.println("This is Test Case #3");
		selectItemAndPurchase();
	}

	private static void loginToAmazon() {
		System.out.println("Eneterd Email Successfully");
		System.out.println("Eneterd Password Successfully");
		System.out.println("Logged in to Amazon Successfully");
		System.out.println("*****************************************");
	}
	
	private static void selectItemAndPurchase() {
		System.out.println("Eneterd LED TV in search toolbar");
		System.out.println("Selected Samsung 48 inch LED tv");
		System.out.println("Added TV to the cart");
		System.out.println("Added delivery address");
		System.out.println("Added Credit card information");
		System.out.println("Purchased the TV");
		System.out.println("*****************************************");
	}
	
	private static void logout() {
		System.out.println("Logged out of Amazon website");
		System.out.println("*****************************************");
	}

}
