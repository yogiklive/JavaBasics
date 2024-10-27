package array;

public class BestTimeToBuySellStock {

	public static void main(String args[]) {

		BestTimeToBuySellStock buySell = new BestTimeToBuySellStock();

		buySell.naiveApproach();

		buySell.betterApproach();

	}

	private void betterApproach() {
		int[] arr = { 5, 3, 1, 10, 15, 2 };

		int minSofar = 0;

		int result = 0;

		for (int i = 0; i < arr.length; i++) {

			minSofar = Math.min(minSofar, arr[i]);

			result = Math.max(result, arr[i] - minSofar);

		}

		System.out.println("Maximum profit is ==> " + result);

	}

	private void naiveApproach() {

		int[] arr = { 5, 3, 1, 10, 15, 2 };

		int res = 0;

		for (int i = 0; i <= arr.length; i++) {

			for (int j = i + 1; j < arr.length - 1; j++) {

				res = Math.max(res, arr[j] - arr[i]);

			}
		}

		System.out.println("Max Profit ==> " + res);

	}
}
