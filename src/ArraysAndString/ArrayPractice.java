package ArraysAndString;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrayExample();
		listOfItems();
	}
	
	public static void arrayExample() {
		int evenNumbers1 [] = new int[12];
		evenNumbers1[0] = 10;
		evenNumbers1[1] = 12;
		evenNumbers1[2] = 14;
		evenNumbers1[3] = 16;
		evenNumbers1[4] = 18;
		evenNumbers1[5] = 22;
		evenNumbers1[6] = 28;
		evenNumbers1[7] = 34;
		evenNumbers1[8] = 44;
		evenNumbers1[9] = 50;
		evenNumbers1[10] = 88;
		evenNumbers1[11] = 100;
		
		int evenNumbers2[] = {2, 4, 6, 10, 12, 14, 16, 22, 26, 30};
		
		System.out.println("The length of evenNumber1 is: "+evenNumbers1.length);
		System.out.println("The length of evenNumber2 is: "+evenNumbers2.length);
		System.out.println("******************************************************");
		System.out.println("The value of even Number1 is: "+evenNumbers1[4]);
		System.out.println("The value of even Number2 is: "+evenNumbers2[8]);
		System.out.println("******************************************************");
		
		for (int i=0;i<10;i++) {
			System.out.println("The value of even Number1 is: "+evenNumbers1[i]);
			System.out.println("The value of even Number2 is: "+evenNumbers2[i]);
			System.out.println("*************----------------------**************");
		}
	}
	
	public static void listOfItems() {
	String itemsList[] = {"LED TV", "Jeans", "GOT Book", "Kitchen ware", "Music CD's", "Dining set", "Mobile"};
		for (int i=0;i<itemsList.length;i++) {
			System.out.println("The elements name is: "+itemsList[i]);
		}
	}

}
