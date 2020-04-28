package array;

public class SecondLargestElement {
	
	public static void main(String args[]){
		
		int arr[] = {25,43,67,8,92,69,45};
		
		int highest = 0;
		System.out.println("initialising highest " + highest);
		int secondHighest =0;
		System.out.println("initialising secondHighest " + secondHighest);
		
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]>highest){
				secondHighest = highest;
				highest =arr[i];
			}else if(arr[i]>secondHighest && arr[i]!=highest){
				secondHighest = arr[i];
				
			}
		}
		
		System.out.println("highest " + highest);
		System.out.println("secondHighest " + secondHighest);
		
		
	}

}
