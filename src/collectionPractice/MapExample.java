package collectionPractice;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashMap<String, Integer> inventoryOfItems = new HashMap<>();
	//[Camera -- 10, Televison -- 4, Laptop -- 20]
	inventoryOfItems.put("Camera", 10);
	inventoryOfItems.put("Television", 24);
	inventoryOfItems.put("laptop", 13);
	inventoryOfItems.put("Dining Set", 8);
	inventoryOfItems.put("Printers", 10);
	inventoryOfItems.put("Camera", 38);
	
	System.out.println(inventoryOfItems);
	System.out.println(inventoryOfItems.containsKey("Dining"));
	System.out.println(inventoryOfItems.containsValue(100));
	System.out.println(inventoryOfItems.remove("laptop", 13));
	System.out.println(inventoryOfItems);
	System.out.println(inventoryOfItems.replace("Dining Set", 8, 100));
	System.out.println(inventoryOfItems);
	System.out.println(inventoryOfItems.get("Television"));
	System.out.println(inventoryOfItems.keySet());
	System.out.println(inventoryOfItems.values());
	
	}

}
