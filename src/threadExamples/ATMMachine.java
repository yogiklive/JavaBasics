package threadExamples;

public class ATMMachine implements Runnable {
	
	private Account acc = new Account();
	
	public static void main (String args[]){
		
		ATMMachine job = new ATMMachine();
		Thread one = new Thread(job);
		Thread two = new Thread (job);
		one.setName("user1");
		one.setName("user2");
		one.start();
		two.start();
	}
	
	public void run(){
		
		for(int i=0;i<10;i++){
			makeWithDraw(10);
			if(acc.getBalance()<0){
				System.out.println("Overdrawn");
			}
			
		}
	}

	private void makeWithDraw(int amt) {
		
		if(acc.getBalance()>=amt){
			System.out.println(Thread.currentThread().getName()+"is about to withdraw");
		
		
		try{
			System.out.println(Thread.currentThread().getName()+"is about to sleep");
			Thread.sleep(500);
		}catch(InterruptedException e){
		System.out.println(Thread.currentThread().getName()+"woke up");	
		acc.withdraw(amt);
		System.out.println(Thread.currentThread().getName()+"completes withdraw");
		}
		}
		else{
			System.out.println("Sorry not enough for" + Thread.currentThread().getName());
		}
	}

}
