package threadExamples;

public class ThreadTester {
	
	public static void main(String args[]){
		
		MyRunnable myRunnable = new MyRunnable();
		
		Thread th = new Thread(myRunnable);
		
		th.start();
		
		System.out.println("back in main");
	}

}
