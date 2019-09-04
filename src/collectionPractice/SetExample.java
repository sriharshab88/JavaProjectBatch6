package collectionPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> items = new ArrayList<>();
		items.add("Television");
		items.add("Camera");
		items.add("Laptop");
		items.add("Camera");
		items.add("Dining set");
		items.add("Dining Set");
		
		System.out.println(items);
		
		Set<String> uniqueItems = new HashSet<>();
		uniqueItems.addAll(items);
		System.out.println(uniqueItems);
		
	
		
		String a = "Television";
		System.out.println(a.hashCode());    //675714098
		String b = "Camera";
		System.out.println(b.hashCode());  //2011082565
		
		String c = "Laptop";   //-2026118662
		System.out.println(c.hashCode());
		
		String d = "Dining set";   //-902563173
		System.out.println(d.hashCode()); 
		
	}

}
