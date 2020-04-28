package stack;

import java.util.Stack;

public class StackInJava {
	
	
	public static void main (String args[]){
		
		Stack<Integer> stack = new Stack<Integer>();
		
		//pushing elements to stack
		for(int i=0;i<5;i++){
			stack.push(i);
		}
		
		//popping elements in stack
		for(int i=0;i<2;i++){
			Integer removedValue = (Integer)stack.pop();
			System.out.println(removedValue);
		}
		
		//peek - return the first element from stack but does not remove it
		Integer peekValue = (Integer)stack.peek();
		System.out.println("peekValue " +peekValue);

		//Searching element in the stock. If element found return the position of element,else returns -1
		Integer searchElement = (Integer)stack.search(2);
		
		if(searchElement==-1){
			System.out.println("Search element is not found");
		}else{
			System.out.println("The search element is " + searchElement);
		}
		
	}

}
