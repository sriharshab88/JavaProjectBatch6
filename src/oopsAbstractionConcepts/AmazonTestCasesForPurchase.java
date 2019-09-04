package oopsAbstractionConcepts;

public class AmazonTestCasesForPurchase {

	public static void main(String[] args) {
		AmazonElectronicsItemPurchase amazonElectronics = new AmazonElectronicsItemPurchase();
		amazonElectronics.loginToAmazon();
		amazonElectronics.selectItems();
		amazonElectronics.selectDeliveryAddress();
		amazonElectronics.addCreditCardInfo();
		amazonElectronics.logout();
		
		System.out.println("****************************************************");
		
		AmazonFurnitureItemPurchase amazonFurnitures = new AmazonFurnitureItemPurchase();
		amazonFurnitures.loginToAmazon();
		amazonFurnitures.selectItems();
		amazonFurnitures.selectDeliveryAddress();
		amazonFurnitures.addCreditCardInfo();
		amazonFurnitures.logout();
}
}
