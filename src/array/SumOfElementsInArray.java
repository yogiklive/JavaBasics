package array;

import java.util.*;
import java.util.Map.Entry;

//To Find the pair of elements in array whose sum is 15
public class SumOfElementsInArray {

	public static void main(String args[]) {
		
		int sumTofind = 15;

		int[] arr = { 7, 4, 8, 10, 6, 9 };

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
		}
		
		System.out.println(map);

		for(Entry<Integer,Integer> tmp : map.entrySet()){
			
		int toFind = sumTofind - tmp.getKey();
		
		if(map.get(toFind)!=null){
			
			System.out.println("the pair producting " + sumTofind + " is " + tmp.getKey() + " + "+ toFind);
			
		}
			
		}
		
		
	}

}
