package sorting;

public class SelectionSort1 {

	public static void main(String args[]) {
		
		SelectionSort1 sort = new SelectionSort1();
		
		sort.sortElements();
		
		
	}

	public void sortElements(){
		
		int minValue;
		int minIndex = 0;
		boolean flag = false;
		
		int[] arr = {9,2,4,3,1,10,6,8};
		
		
		for(int i=0;i<arr.length-1;i++){
			
			minValue = arr[i];
			
			for (int j=i+1;j<arr.length;j++){
				
				if(minValue > arr[j]){
					flag = true;
					minValue = arr[j];
					minIndex = j;
				}
			}
			
			if(flag)
			swap(arr,i,minIndex);
			
			System.out.println();
			printArray(arr);
			flag = false;
		}
		
	}
	
	public void swap(int[] arr1,int currentIndex, int minIndex){
		
		int temp = 0;
		temp = arr1[currentIndex];
		arr1[currentIndex] = arr1[minIndex];
		arr1[minIndex] = temp;
		
	}
	
	public void printArray(int[] arr){
		
		for(int i=0;i<arr.length;i++){
			
			System.out.print(arr[i]);
		}
	}
	
	

}
