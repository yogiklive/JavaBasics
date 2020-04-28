package array;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String args[]){
		
		int[] arr = {23,45,8,74,30,44,57,63,33};
		
		Arrays.sort(arr);
		int first = 0;
		int last = arr.length-1;
		int key = 57;
		
		BinarySearch binarySearch = new BinarySearch();
		binarySearch.findElement(arr,first,last,key);
		
	}

	private void findElement(int[] arr, int first, int last, int key) {

		
		
		while(first<=last){
			
			int mid = (first+last)/2;
			
			if(key == arr[mid]){
				System.out.println("Element is found");
				break;
			}else if(key>arr[mid]){
				first = mid +1;
			}else{
				last = mid -1;
			}
		}
		
	}

}
