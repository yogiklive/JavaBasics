package threadExamples;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
         go();		
	}

	private void go() {
		domore();
		
	}

	private void domore() {
		System.out.println("Top of the stack");
		
	}

}
