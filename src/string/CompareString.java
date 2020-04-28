package string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompareString {
	public static void main(String args[]){
		CompareString com = new CompareString();
		com.elimateDuplicate ("BC","BANGALORE");
		
	}

	private void elimateDuplicate(String str1, String str2) {

		List<String> list1= Arrays.asList(str1.split(""));
		List<String> list2= Arrays.asList(str2.split(""));
		
		String delim = "";
		
		System.out.println("List1 " + list1);
		System.out.println("List2 " + list2);
		
		List<String> filteredList1 = list1.stream()
			      .filter(empl -> list2.stream()
			        .noneMatch(dept -> 
			          dept.contains(empl)
			          ))
			        .collect(Collectors.toList());
		
		String String1 = String.join(delim, filteredList1);
		
		System.out.println("string1 " + String1);
		
		List<String> filteredList2 = list2.stream()
			      .filter(empl -> list1.stream()
			        .noneMatch(dept -> 
			        empl.contains(dept)
			          ))
			        .collect(Collectors.toList());
		
		

		String String2 = String.join(delim, filteredList2);
		
		//String string2 = filteredList2.toString();
		
		System.out.println("String2 " + String2);
		
	}

}
