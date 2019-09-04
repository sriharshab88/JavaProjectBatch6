package collectionPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class IteratorExample {
	
	static ArrayList<String> emailIds = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		emailIds.add("harsha@gmail.com");
		emailIds.add("prem@gmail.com");
		emailIds.add("james@gmail.com");
		emailIds.add("john@gmail.com");
		emailIds.add("michael@yahoo.co.in");
		emailIds.add("adams@hotmail.com");
		emailIds.add("charles@yahoo.co.in");
		
		Iterator<String> iterator = emailIds.iterator();
		while(iterator.hasNext()) {
			iterator.next();
			String email = iterator.next();
			System.out.println("*********"+email);
			if(!email.contains("gmail")) {
				iterator.remove();
			}else {
			System.out.println(email.replace("gmail", "etechfactory"));
			}
		}
		
	}

}
