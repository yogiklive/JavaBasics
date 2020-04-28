package interviewPrograms.collectionPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DictionaryImplementation {
	
	public static void main (String args[]){
		
		DictionaryImplementation dictionaryImplementation = new DictionaryImplementation();
		
		dictionaryImplementation.addElements();
		
	}

	private void addElements() {
		
		HashMap<String,ArrayList> elecMap = new HashMap<String,ArrayList>();
		
		ArrayList<String> elecList = new ArrayList<String>();
		elecList.add("Mobile");
		elecList.add("Laptop");
		elecList.add("FitBIT");
		
		elecMap.put("Electronics",elecList);
		
		
		for(Map.Entry<String,ArrayList> tmp: elecMap.entrySet()){
			
		ArrayList<String> arrayList = tmp.getValue();
		
		for(String tmpVar: arrayList)
			
			System.out.println("value "+ tmpVar);
		
		
	}

}
}
