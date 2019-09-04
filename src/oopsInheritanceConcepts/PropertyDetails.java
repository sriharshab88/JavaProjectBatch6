package oopsInheritanceConcepts;

public class PropertyDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandDadProperties grandDadProperties = new GrandDadProperties();
		System.out.println("This is Grand dad's properties");
		System.out.println(grandDadProperties.hardCash);
		System.out.println(grandDadProperties.importedCars);
		grandDadProperties.farmHouse();
		grandDadProperties.industry();
		grandDadProperties.villa();
		System.out.println("*********************************");
		
		DadProperties dadProperties = new DadProperties();
		System.out.println("This is dad's properties");
		System.out.println(dadProperties.cars);
		dadProperties.emptyLand();
		dadProperties.jewelleries();
		dadProperties.villa();
		System.out.println("**********************************");
		
		SonProperties sonProperties = new SonProperties();
		System.out.println("This is Son's properties");
		sonProperties.clubHouse();
		System.out.println("**********************************");
		
		DadProperties dadProperties1 = new DaughterProperties();
		dadProperties1.villa();
		
	}

}
