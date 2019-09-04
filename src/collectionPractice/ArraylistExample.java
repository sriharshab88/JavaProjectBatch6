package collectionPractice;

import java.util.ArrayList;

public class ArraylistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arrayOfNumbers = {"One", "Two", "Three", "Four", "Five"};
		String[] anotherArrayOfNumbers = new String [3];
		anotherArrayOfNumbers[0] = "Six";
		anotherArrayOfNumbers[1] = "Seven";
		anotherArrayOfNumbers[2] = "Eight";
		
		ArrayList<String> newItemList= new ArrayList<>();
		ArrayList<String> newItemList2= new ArrayList<>();
		for (int i=0;i<arrayOfNumbers.length;i++) {
			newItemList.add(arrayOfNumbers[i]);
			newItemList2.add(arrayOfNumbers[i]);
		}
		System.out.println(newItemList);
		System.out.println(newItemList2);
		for (int j=0;j<anotherArrayOfNumbers.length;j++) {
			newItemList.add(anotherArrayOfNumbers[j]);
		}
		
		newItemList.add(3, "Ten");
		newItemList.add("Hundred");
		newItemList.addAll(newItemList2);
		System.out.println(newItemList);
		System.out.println(newItemList.contains("Eleven"));
		System.out.println(newItemList.containsAll(newItemList2));
		System.out.println(newItemList.get(6));
		newItemList.remove(4);
		
		System.out.println(newItemList);
		System.out.println(newItemList.size());
		newItemList.clear();
		System.out.println(newItemList);
		

	}
	
	

}
