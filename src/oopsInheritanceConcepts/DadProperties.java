package oopsInheritanceConcepts;

public class DadProperties extends GrandDadProperties{
	
	public DadProperties() {
		this.industry();
	}
	
	public static void main(String args[]) {
		farmHouse();
		jewelleries();
		emptyLand();
		villa();
		industry();
	}

	public static int cars =3;
	
	public static void emptyLand() {
		System.out.println("This is dad's empty land");
	}
	
	public static void jewelleries() {
		System.out.println("This is dad's jewelleries");
	}
	
	public static void villa() {
		System.out.println("This is dad's villa");
	}

}
