package oopsInterfaceConcepts;

public class AmazonSanityTestCases {

	public static void main(String args[]) {
		amazonChromeUseCases();
		amazonFirefoxUseCases();
		amazonSafariUseCases();
		amazonKindleChromeUseCases();
	}
	
	public static void amazonChromeUseCases() {
		AmazonUseCaseInChromeBrowser amazonChromeUsecases = new AmazonUseCaseInChromeBrowser();
		amazonChromeUsecases.loginToAmazon();
		amazonChromeUsecases.selectItems();
		amazonChromeUsecases.selectDeliveryAddress();
		amazonChromeUsecases.addCreditCardInfo();
		amazonChromeUsecases.editProfile();
		amazonChromeUsecases.logout();
		System.out.println("***************************************");
	}
	
	public static void amazonFirefoxUseCases() {
		AmazonUseCaseInFirefoxBrowser amazonFirefoxUsecases = new AmazonUseCaseInFirefoxBrowser();
		amazonFirefoxUsecases.loginToAmazon();
		amazonFirefoxUsecases.selectItems();
		amazonFirefoxUsecases.selectDeliveryAddress();
		amazonFirefoxUsecases.addCreditCardInfo();
		amazonFirefoxUsecases.editProfile();
		amazonFirefoxUsecases.logout();
		System.out.println("***************************************");
	}
	
	public static void amazonSafariUseCases() {
		AmazonUseCaseInSafariBrowser amazonSafariUsecases = new AmazonUseCaseInSafariBrowser();
		amazonSafariUsecases.loginToAmazon();
		amazonSafariUsecases.selectItems();
		amazonSafariUsecases.selectDeliveryAddress();
		amazonSafariUsecases.addCreditCardInfo();
		amazonSafariUsecases.editProfile();
		amazonSafariUsecases.logout();
		System.out.println("***************************************");

	}
	
	public static void amazonKindleChromeUseCases() {
		AmazonUseCaseInChromeBrowser amazonChromeUsecases = new AmazonUseCaseInChromeBrowser();
		amazonChromeUsecases.loginToAmazonKindle();
		amazonChromeUsecases.selectABook();
		amazonChromeUsecases.startReading();
		System.out.println("***************************************");
	}
}
