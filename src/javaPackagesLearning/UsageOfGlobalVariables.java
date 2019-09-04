package javaPackagesLearning;

public class UsageOfGlobalVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The browsers that are supported are:" + 
				GlobalVariables.browser1 +","+""+
				GlobalVariables.browser2+","+""+
				GlobalVariables.browser3);
		
		System.out.println("The Operating Systems that are supported are:" + 
				GlobalVariables.operatingSystem1 +","+""+
				GlobalVariables.operatingSystem2+","+""+
				GlobalVariables.operatingSystem3);
		
		System.out.println("********After Modification***********");
		
		GlobalVariables.browser2 = "Microsoft Edge";
		GlobalVariables.operatingSystem3 = "Android OS";
		
		System.out.println("The browsers that are supported are:" + 
				GlobalVariables.browser1 +","+""+
				GlobalVariables.browser2+","+""+
				GlobalVariables.browser3);
		
		System.out.println("The Operating Systems that are supported are:" + 
				GlobalVariables.operatingSystem1 +","+""+
				GlobalVariables.operatingSystem2+","+""+
				GlobalVariables.operatingSystem3);
		
	}

}
