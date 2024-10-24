package array;

import java.util.HashSet;

public class DuplicateElement {

	public static void main(String args[]) {

		DuplicateElement duplicateElement = new DuplicateElement();
		duplicateElement.findDuplicateBruteForce();
		duplicateElement.findDuplicateUsingAuxillaryArray();
		duplicateElement.findDupicatesUsingHashSet();

	}

	// O(n^2)
	private void findDuplicateBruteForce() {

		int arr[] = { 7, 5, 3, 7, 2, 3, 4, 2 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.println("Duplicate Element " + arr[i]);
				}

			}
		}
	}

	// O(n)
	// add one in second array for index postion of each element in first array
	// This works only if the elements value in the array is less the value of
	// size of the array
	private void findDuplicateUsingAuxillaryArray() {

		int[] arr = { 2, 1, 3, 4, 1 };

		int[] arr1 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			if (arr1[arr[i]] == 1) {
				System.out.println(" Duplicate element is " + arr[i]);
			} else {

				arr1[arr[i]] = arr1[arr[i]] + 1;
			}
		}
	}

	private void findDupicatesUsingHashSet() {

		int[] arr = { 52, 78, 21, 12, 78, 5 };

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (set.contains(arr[i])) {
				System.out.println("Duplicate Element is " + arr[i]);
			} else {
				set.add(arr[i]);
			}
		}

	}

}
