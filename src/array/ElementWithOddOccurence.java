package array;
import java.util.*;
import java.util.Map.Entry;

public class ElementWithOddOccurence {
	
	public static void main (String args[]){
		
		int[] arr = {20,30,30,20,40,30,40,50,50};
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++){
			
			if(map.get(arr[i])==null){
				map.put(arr[i], 1);
			}else{
				map.put(arr[i],map.get(arr[i])+1);
			}
		}
		
		for(Entry<Integer,Integer> tmp:map.entrySet()){
			if(tmp.getValue()%2!=0){
			System.out.println("Element is "+tmp.getKey()+" occurence " +tmp.getValue());
		}
		}
		
		
		
	}

}
