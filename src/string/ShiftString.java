package string;

public class ShiftString {
	
	public static void main(String args[]){
		
		String s= "abcd";
		int leftShifts=1;
		int rightShifts=2;
		
		ShiftString shiftString = new ShiftString();
		shiftString.getShiftedString(s,leftShifts,rightShifts);
	}

	private void getShiftedString(String s, int leftShifts, int rightShifts) {

		char[] str=s.toCharArray();
		
		for(int i=0;i<leftShifts;i++){  
            s = s.substring(1, s.length())+ String.valueOf(s.charAt(0));     
        }
		
      for(int i=0;i<rightShifts;i++){
            
            //String lastElement= Character.toString(s.charAt(s.length()-1));
            
            String lastElement= s.substring(s.length()-1);
            
            s = s.substring(0, s.length()-1);
             
            s= lastElement+s;
        }
    	System.out.println();	
	}

}
