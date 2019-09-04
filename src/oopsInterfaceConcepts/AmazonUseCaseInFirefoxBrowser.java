package oopsInterfaceConcepts;

public class AmazonUseCaseInFirefoxBrowser implements AmazonUseCases, AmazonPrimeUseCases{

	@Override
	public void loginToAmazon() {
		System.out.println("Logged in to amazon website in Firefox browser");
	}

	@Override
	public void selectItems() {
		System.out.println("Selected Apple macbook electronic item");
	}

	@Override
	public void selectDeliveryAddress() {
		System.out.println("Added New Jersey delivery address");
	}

	@Override
	public void addCreditCardInfo() {
		System.out.println("Added Visa Credit card info");
	}

	@Override
	public void logout() {
		System.out.println("Logged out from Firefox browser");
	}

	@Override
	public void editProfile() {
		System.out.println("Edited the Email ID");
	}

	@Override
	public void loginToAmazonKindle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectABook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startReading() {
		// TODO Auto-generated method stub
		
	}

}
