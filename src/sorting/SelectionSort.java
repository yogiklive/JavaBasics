package sorting;

/*The selection sort algorithm sorts an array by repeatedly finding the minimum element
(considering ascending order) from unsorted part and putting it at the beginning*/

public class SelectionSort {

	public static void main (String args[]){
		
		int[] arr = {3,35,60,2,7,1,23};
		
		
		for(int i=0;i<arr.length-1;i++){
			
			int minIndex = i;
			int minValue = arr[i];
			int swapIndex = 0;
			
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[j]<minValue){
					minValue = arr[j];
					swapIndex = j;
				}
				
			}
			System.out.println("minValue is" + minValue);
			
			int temp = 0;
			
			temp = arr[minIndex] ;
			arr[minIndex]= arr[swapIndex];
			arr[swapIndex]= temp;
			
			int n = arr.length; 
			for (int q=0;q<n; ++q) 
				System.out.print(arr[q]+" "); 
			System.out.println();
			
		}
		
		
	}
	
}
