package interviewPrograms.collectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSmallerElement {
	
	
	public static void main (String args[]){
		//List<Integer> intList =  (ArrayList<Integer>) Arrays.asList(10,20,5,30,4,20,60);
		
		ArrayList<Integer> intList =  new ArrayList<Integer>();
		
		intList.add(10);
		intList.add(20);
		intList.add(05);
		intList.add(30);
		intList.add(04);
		intList.add(20);
		intList.add(60);
		
		updateList(intList);
		/*for(int i=1;i<=intList.size()-2;i++){
			System.out.println("element is " + intList.get(i));
			if(intList.get(i)<intList.get(i-1) && intList.get(i)<intList.get(i+1)){
				System.out.println("before removal" + intList.get(i));
				intList.remove(i);
			}
		}*/
	}
	
	    public static void updateList(List<Integer> list) {
	        // Implement this method as per the required logic
	            for(int i=1;i<list.size()-1;i++){
	                if(list.get(i)<list.get(i-1) && list.get(i)<list.get(i+1)){
	                    list.remove(i);
	                }
	            }
	            
	       for(int i=1;i<list.size()-1;i++){
	                if(list.get(i)<list.get(i-1) && list.get(i)<list.get(i+1)){
	                    updateList(list);
	                }
	            }
	        
	    }

}
