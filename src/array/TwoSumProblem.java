package array;

import java.util.HashSet;

public class TwoSumProblem {

	public static void main(String args[]) {

		int[] arr = { 5, 7, 9, 10, 12, 3 };

		int target = 10;

		HashSet<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {

			int toFind = target - arr[i];

			if (set.contains(toFind)) {

				System.out.println(
						"Sum of two element in the array " + arr[i] + " + " + toFind + " is equal to target " + target);

			} else {
				set.add(arr[i]);

			}

		}
	}

}
