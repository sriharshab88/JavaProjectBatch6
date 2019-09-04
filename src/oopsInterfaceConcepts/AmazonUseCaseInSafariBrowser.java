package oopsInterfaceConcepts;

public class AmazonUseCaseInSafariBrowser implements  AmazonUseCases{
	
	@Override
	public void loginToAmazon() {
		System.out.println("Logged in to amazon website in Safari browser");
	}

	@Override
	public void selectItems() {
		System.out.println("Selected LED TV electronic item");
	}

	@Override
	public void selectDeliveryAddress() {
		System.out.println("Added New York delivery address");
	}

	@Override
	public void addCreditCardInfo() {
		System.out.println("Added Mastercard Credit card info");
	}

	@Override
	public void logout() {
		System.out.println("Logged out from Safari browser");
	}

	@Override
	public void editProfile() {
		System.out.println("Edited the mobile number");
	}

}
