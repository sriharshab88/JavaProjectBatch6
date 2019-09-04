package oopsPolyMorphismAndEncapsulation;

public class EncapsulationExample {
	
	private int courses = 10;
	private String[] courseList = {"JAVA", "Dotnet", "AWS", "Selenium", "Python"};
	
	public static void main(String args[]) {
		viewMyWebsite();
	}
	
	private static void accessMyWebsite() {
		System.out.println("Access granted for this website");
	}
	
	private static void myWebsiteName() {
		System.out.println("Website name is: Etechfactory");
	}
	
	public int getCourses() {
		return courses;
	}

	public void setCourses(int courses) {
		this.courses = courses;
	}

	public String[] getCourseList() {
		return courseList;
	}

	public void setCourseList(String[] courseList) {
		this.courseList = courseList;
	}

	private static void myWebsiteLocation() {
		System.out.println("Website location is: Bangalore");
	}
	
	private static void viewMyWebsite() {
		accessMyWebsite();
		myWebsiteLocation();
		myWebsiteName();
	}

}
