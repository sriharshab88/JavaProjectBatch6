package ArraysAndString;

public class StringMethodsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stringMethodsExample("This is a Java session", "STUDENTS@etechfactory.com");
	}
	
	public static void stringMethodsExample(String value1, String value2) {
		String actualItemsList = "Haircare, Deo, Baby products, Skin care"; //website
		String expectedItemsList = "Haircare, deo, Baby products, Baby Skin care"; //stored
		String value3 = "There are 546 students in this college";
		int newValue = 333;
		
			System.out.println("The length of the string: "+value2.length());
			System.out.println(value1.equals("This is a java session"));
			System.out.println(value2.substring(9));
			System.out.println(value2.substring(3, 10));
			System.out.println(value2.charAt(5));
			System.out.println(value2.indexOf("@"));
			System.out.println(value1.concat(value2));
			System.out.println(value2.contains("etech"));
			System.out.println(value2.contentEquals("students@etechfactory.com"));
			System.out.println(value2.endsWith("co"));
			System.out.println(value2.equalsIgnoreCase("students@EtechFactory.com"));
			System.out.println(actualItemsList.hashCode());
			System.out.println(expectedItemsList.hashCode());
			System.out.println(actualItemsList.hashCode() == expectedItemsList.hashCode());
			System.out.println(value2.indexOf("s", 1));
			System.out.println(value3.isEmpty());
			System.out.println(value2.replace("s", "S"));
			System.out.println(expectedItemsList.replaceAll("Baby", "Kids"));
			System.out.println(expectedItemsList.replaceFirst("Baby", "Kids"));
			char outputOfValue2 []  = value2.toCharArray();
			System.out.println(outputOfValue2);
			System.out.println(value2.toLowerCase());
			System.out.println(value2.toUpperCase());
			System.out.println("Before trimming: " +value2);
			System.out.println("After trimming: " +value2.trim());
			String splittedValues [] = value2.split("@");
			System.out.println(splittedValues[0]);
			System.out.println(splittedValues[1]);
		
	}

}
