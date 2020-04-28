package finalExample;

public  class TestFinal {
	
	public final static int constantValue = 1324;
	
	
	public static void main (String args []){
		//constantValue = 5678;
		TestFinal testFinal  = new TestFinal();
		
		testFinal.changeFinal(constantValue);
		
	}

	 public final void display(int a){
	      System.out.println("Hello welcome to Tutorialspoint");
	   }

	public final void changeFinal(int constantValue) {
		
		
		/*final int  constantValue1 = 200;
		
		constantValue1 = 300;*/

		constantValue = 5678;// Each object of java will have its own copy on instance variables
		
		System.out.println("value of final " + constantValue);
	}
	

}
