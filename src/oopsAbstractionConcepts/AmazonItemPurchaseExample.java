package oopsAbstractionConcepts;

public abstract class AmazonItemPurchaseExample {
	
	public abstract void loginToAmazon();
	public abstract void selectItems();
	public abstract void selectDeliveryAddress();
	public abstract void addCreditCardInfo();
	
	public void logout() {
		System.out.println("User is logged out from the amazon website");
	}
	
}
