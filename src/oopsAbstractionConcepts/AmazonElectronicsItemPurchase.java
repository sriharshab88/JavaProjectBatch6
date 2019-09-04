package oopsAbstractionConcepts;

public class AmazonElectronicsItemPurchase extends AmazonItemPurchaseExample{

	public static void main(String[] args) {
	
	}

	@Override
	public void loginToAmazon() {
		System.out.println("Logged in to amazon website in Chrome browser");
	}

	@Override
	public void selectItems() {
		System.out.println("Selected LED TV electronic item");
	}

	@Override
	public void selectDeliveryAddress() {
		System.out.println("Added California delivery address");
	}

	@Override
	public void addCreditCardInfo() {
		System.out.println("Added American Express Credit card info");
	}

}
