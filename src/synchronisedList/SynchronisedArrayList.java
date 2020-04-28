package synchronisedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronisedArrayList {
	
	public static void main(String args[]){
		
		SynchronisedArrayList obj = new SynchronisedArrayList();
		obj.creatModException();
	}

	private void creatModException() {
		
		//List<String> myList = new ArrayList<String>();
		
		List<String> myList = new CopyOnWriteArrayList<String>();
		myList.add("Sachin");
		myList.add("Ramesh");
		myList.add("Tendulkar");
		
       Iterator<String> iterator = myList.iterator();
       
       while(iterator.hasNext()){
    	   
    	   String temp = iterator.next();
    	   
    	   if(temp.equals("Sachin")){
    		   
    		   myList.remove(temp);
    	   }
    	   
       }
 
       
	}

}
