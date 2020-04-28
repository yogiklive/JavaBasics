package array;

public class SeparateOddEvenNos {
	
	
	public static void main (String args[]){
		
		int[] arr = {2,1,5,8,4,6,7};
        int[] finalArray = new int[arr.length];		
		int evenIndex = 0;
		int oddIndex = arr.length-1;
		
		
		for (int i=0;i<arr.length;i++){
			
			if (arr[i]%2==0){
				finalArray[evenIndex]= arr[i];
				evenIndex ++;
			}else{
				finalArray[oddIndex]=arr[i];
				oddIndex --;
			}
		}
		
		for(int i=0;i<finalArray.length;i++){
			
			System.out.println(finalArray[i]);
			
		}
		
		
	}

}
