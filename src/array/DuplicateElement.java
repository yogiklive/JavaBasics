package array;

public class DuplicateElement {

	public static void main(String args[]) {

		DuplicateElement duplicateElement = new DuplicateElement();
		duplicateElement.findDuplicate();
		// duplicateElement.findDuplicateOptimised();

	}
	
	private void findDuplicate() {

		int arr[] = { 5, 3, 7, 2, 3, 4, 2 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					System.out.println("Duplicate Element " + arr[i]);
				}

			}
		}
	}

	private void findDuplicateOptimised() {

		int arr[] = { 5, 7, 2, 3, 9, 7, 4, 3 };

		int arr1[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			if (i == 0) {
				arr1[i] = arr[i];
			} else {

				for (int j = 0; j < arr1.length; j++) {

					if (arr[i] == arr1[j]) {
						System.out.println("Duplicate element is " + arr[i]);
					} else {
						arr1[j] = arr[i];
					}

				}

			}
		}

	}



}
