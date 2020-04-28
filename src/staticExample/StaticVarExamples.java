package staticExample;

public class StaticVarExamples {
	
	private static int staticExamplesCount = 0;
	
	private int exampleCount = 0;


	public StaticVarExamples(){
		staticExamplesCount++;
		exampleCount++;
	}
	
	
	public static void main(String args[]){
		
		StaticVarExamples staticExamples = new StaticVarExamples();
		System.out.println("staticExamplesCount " + staticExamplesCount);
		//System.out.println("exampleCount " + exampleCount); Throws Error Because Static Variables can be accessed only by Static methods
		staticExamples.printVariables();
		
		StaticVarExamples staticExamples1 = new StaticVarExamples();
		System.out.println("staticExamplesCount " + staticExamplesCount);
		//System.out.println("exampleCount " + exampleCount);
		staticExamples1.printVariables();
		
	}
	
	public void printVariables(){
		System.out.println("exampleCount " + exampleCount);	
		
		
	}
 
}
