package oopsInterfaceConcepts;

public class AmazonUseCaseInChromeBrowser implements AmazonUseCases,AmazonKindleUseCases{

	@Override
	public void loginToAmazon() {
		System.out.println("Logged in to amazon website in Chrome browser");
	}

	@Override
	public void selectItems() {
		System.out.println("Selected Camera electronic item");
	}

	@Override
	public void selectDeliveryAddress() {
		System.out.println("Added California delivery address");
	}

	@Override
	public void addCreditCardInfo() {
		System.out.println("Added American Express Credit card info");
	}

	@Override
	public void logout() {
		System.out.println("Logged out from Chrome browser");
	}

	@Override
	public void editProfile() {
		System.out.println("Edited the Firstname");
	}

	@Override
	public void loginToAmazonKindle() {
		System.out.println("Logged into the amazon kindle device");
	}

	@Override
	public void selectABook() {
		System.out.println("Selected the Novel");
	}

	@Override
	public void startReading() {
		System.out.println("Reading the novel");
	}

}
