package string;

//Java program to reverse a string using recursion 

class StringReversal
{ 

	public static void main(String args []){
		StringReversal stringReversal = new StringReversal();
		String str = "YOGESH";
		stringReversal.reverse(str);	
	}

	private void reverse(String str) {

		if(str==null || str.length()<=0){
			System.out.println(" " + str);
		}
		else{
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0, str.length()-1));
			
		}
	}
} 
