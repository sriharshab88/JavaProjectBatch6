package oopsAbstractionConcepts;

public class AmazonFurnitureItemPurchase extends AmazonItemPurchaseExample{

	@Override
	public void loginToAmazon() {
		System.out.println("Logged in to Amazon website in Firefox browser");
	}

	@Override
	public void selectItems() {
		System.out.println("Selected the Dining set from Furniture section");
	}

	@Override
	public void selectDeliveryAddress() {
		System.out.println("Selected New York delivery address");
	}

	@Override
	public void addCreditCardInfo() {
		System.out.println("Added Discover Credit card info");
	}
	
	@Override
	public void logout() {
		System.out.println("Logged out from the Firefox browser");
	}

}
