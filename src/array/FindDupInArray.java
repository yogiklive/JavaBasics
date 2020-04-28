package array;

public class FindDupInArray {

	public static void main(String args[]) {

		FindDupInArray findDupInArray = new FindDupInArray();

		findDupInArray.method1();
		findDupInArray.method2();

	}

	//Will Fetch result only when the nos in the array are less than the size of the array
	private void method2() {

		int[] arr = { 4, 1, 3, 5, 3, 4 };
		int[] countArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (countArr[arr[i]] == 1) {
				System.out.println("The duplicate element is " + arr[i]);
			} else {
				countArr[arr[i]]++;
			}
		}
	}

	
	private void method1() {

		int[] arr = { 4, 1, 3, 5, 3, 4 };
		
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("duplicate element is " + arr[i]);
				}
			}
		}
	}

}
