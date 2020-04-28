package string;

public class ReverseString {
	
	public static void main(String args[]){
		
		String strName = "Yogesh";
		
		
		/*for(int i=strName.length()-1;i>=0;i--){
			
			System.out.print(strName.charAt(i));
		}*/
		
		ReverseString reverseString = new ReverseString();
		reverseString.reverse(strName);
		
		
	}
	
	public void reverse(String strName){
		
		if(strName==null || "".equals(strName)){
			System.out.println();			
		}else{
			System.out.print(strName.charAt(strName.length()-1));
			strName = strName.substring(0,strName.length()-1);
			reverse(strName);
		}
	}

}
