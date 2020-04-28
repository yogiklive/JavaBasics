package hacker.practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



class Result {

    /*
     * Complete the 'writeIn' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY ballot as parameter.
     */

    public static String writeIn(List<String> ballot) {
    	
    	HashMap<String, Integer> ballotMap = new HashMap<String, Integer>();
    	
    	
    	int noOfBallots = Integer.parseInt(ballot.get(0));
    	
    	int nameCount=0;
    	
    	for(int i=1;i<ballot.size();i++){   
    		
    		if(ballotMap.get(ballot.get(i))==null || ballotMap.get(ballot.get(i)).equals("")){
    			nameCount = 1;
    		}else{
    			nameCount = ballotMap.get(ballot.get(i)) +1;
    		}
    		
    		ballotMap.put(ballot.get(i), nameCount);    		
    		
    	/*	if(nameCount==1){
    			
    		}else{
    			ballotMap.put(ballot.get(i), nameCount+1);
    		}*/
    	}
    	
    	HashMap<String,Integer> SortedMap = SortMapByValue(ballotMap);

    	 Map.Entry<String,Integer> entry = SortedMap.entrySet().iterator().next();
    	     	 
    	 int maxValue = entry.getValue();
    	 
    	 List<String> listWithMaxValue = new ArrayList<String>();
    	 
    	 
    	 String retrunString="";
    	 
    	 
    	 for(Entry<String, Integer> temp:SortedMap.entrySet()){
    		 
    		 if(temp.getValue().equals(maxValue)){
    			 listWithMaxValue.add(temp.getKey());
    		 }
    		 
    	 }
    		 
    		 Collections.sort(listWithMaxValue);
    		 
    		 retrunString  = listWithMaxValue.get(listWithMaxValue.size()-1);
    		 
    	 
		return retrunString;
    	 
    	 
    	


    }

	private static HashMap<String, Integer> SortMapByValue(HashMap<String, Integer> ballotMap) {
		
		   Comparator<Entry<String, Integer>> valueComparator = new Comparator<Entry<String,Integer>>() {
	            
	            @Override
	            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
	            	Integer v1 = e1.getValue();
	            	Integer v2 = e2.getValue();
	                return v2.compareTo(v1);
	            }
	        };
		
		Set<Entry<String, Integer>> entries = ballotMap.entrySet();
		
		List<Entry<String, Integer>> listOfEntries = new ArrayList<Entry<String, Integer>>(entries);
		
		Collections.sort(listOfEntries, valueComparator);
		
		LinkedHashMap<String, Integer> sortedByValue = new LinkedHashMap<String, Integer>(listOfEntries.size());
		
		 for (Entry<String, Integer> aa : listOfEntries) { 
			 sortedByValue.put(aa.getKey(), aa.getValue()); 
	        } 
		
		return sortedByValue;
        
	}
	
	   public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	       /* int ballotCount = Integer.parseInt(bufferedReader.readLine().trim());

	        List<String> ballot = new ArrayList<>();

	        for (int i = 0; i < ballotCount; i++) {
	            String ballotItem = bufferedReader.readLine();
	            ballot.add(ballotItem);
	        }*/
	        
	        List<String> ballot = Arrays.asList("10","Yogesh","SaiKrithika","Soniya","Ponmudi","SaiKrithika","Yogesh");

	        String result = Result.writeIn(ballot);

	       /* bufferedWriter.write(result);
	        bufferedWriter.newLine();*/

	        bufferedReader.close();
	       // bufferedWriter.close();
	    }

}


