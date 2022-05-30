package array;

public class LargestAndSmallest {
	
	public static void main(String args[]){
		
		int minValue=0;
		int maxValue=0;
		
		int[] arr = {5,67,3,77,9,14,23};
		
		minValue= arr[0];
		maxValue= arr[0];
		
		for(int i=1;i<arr.length;i++){
		
			
			if(arr[i]<minValue){
				minValue=arr[i];
			}

			if(arr[i]>maxValue){
				maxValue=arr[i];
			}
		}
		
		System.out.println("Minimum Value is " + minValue);
		System.out.println("Maximum value is " + maxValue);
		
		
		
		
		
		
		
		
		
	}

}
