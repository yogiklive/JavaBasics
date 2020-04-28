package interviewPrograms.collectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Solution {

	public static void main(String args[]) {

		Solution sol = new Solution();

		List<String> products = Arrays.asList("yellowShirt", "redHat", "blackShirt", "bluePants", "redHat", "pinkHat",
				"blackShirt", "yellowShirt", "greenPants", "greenPants");

		sol.featuredProduct(products);

	}

	private void featuredProduct(List<String> products) {
		
		HashMap<String,Integer> productMap = new HashMap<String,Integer>(); 
 
		for(String temp: products){
			
			if(productMap.get(temp)==null){
				
				productMap.put(temp,1);
			}else{
				productMap.put(temp, productMap.get(temp)+1);
			}
		}
		
		int max = Collections.max(productMap.values());
		
		List<String> keys = new ArrayList<String>();
		
		for(Entry<String, Integer> entry: productMap.entrySet()){
			if(entry.getValue()==max){
				keys.add(entry.getKey());
			}
		}
		
		Collections.sort(keys);
		
		String product = keys.get(keys.size()-1);
		
	}

}
