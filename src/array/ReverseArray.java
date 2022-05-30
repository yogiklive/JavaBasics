package array;

public class ReverseArray {

	public static void main(String args[]) {

		int[] arrInt = { 1, 2, 3, 4, 5 };
		int[] reverseArr = new int[arrInt.length];

		int reverseArrSize = reverseArr.length - 1;

		for (int i = 0; i < arrInt.length; i++) {
			reverseArr[reverseArrSize - i] = arrInt[i];
		}

		// printing reverse array
		for (int i = 0; i < reverseArr.length; i++) {
			System.out.println(reverseArr[i]);
		}
		
		//Simple way reverse traversal
		for(int i = arrInt.length-1;i>=0;i--){
			System.out.println(arrInt[i]);
		}
	}
}
