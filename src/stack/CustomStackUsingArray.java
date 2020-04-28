package stack;

public class CustomStackUsingArray {
	
	int top;
	int size;
	int[] arr;
	
	CustomStackUsingArray(int size){
		this.size = size;
		this.arr =  new int[size];
		this.top=-1;
		
	}
	
	public void push(int pushedElement){
		if(!isfull()){
			top++;
			arr[top] = pushedElement;
			System.out.println("Pushed element is " + pushedElement);
		}else{
			System.out.println("Stack is full");
		}
	}

	public boolean isfull() {
		if(size -1 == top){
			return true;
		}else{
			return false;
		}
	}
	
	public void pop(){
		if(!empty()){
			top--;
			int returnedTop = arr[top];
			System.out.println("Popped element is "+ returnedTop);
		}else{
			System.out.println("Stack is empty");
		}
		
	}

	private boolean empty() {
		if(top==-1){
			return true;
		}else{
			return false;
		}
		
	}
	
	public static void main(String args[]){
		
		CustomStackUsingArray customStackUsingArray = new CustomStackUsingArray(5);
		customStackUsingArray.pop();
		customStackUsingArray.push(1);
		customStackUsingArray.push(2);
		customStackUsingArray.push(3);
		customStackUsingArray.push(4);
		customStackUsingArray.push(5);
		customStackUsingArray.push(6);
		
		customStackUsingArray.pop();
		customStackUsingArray.pop();
		customStackUsingArray.pop();
		
		
		
		
	}

}
