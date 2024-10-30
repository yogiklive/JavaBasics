package array;

public class ProductOfEleExceptSelf {

	public static void main(String args[]) {

		ProductOfEleExceptSelf obj = new ProductOfEleExceptSelf();

	    obj.naiveApproach();
		obj.optimsedApproach();

	}

	// { 1, 2, 3, 4 }
	// {1,1,2,6}
	// {24, 12, 4, 1}
	private void optimsedApproach() {
		int[] arr = { 1, 2, 3, 4 };
		int n = arr.length;
		int[] pre = new int[arr.length];
		int[] post = new int[arr.length];
		int[] res = new int[arr.length];

		pre[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			pre[i] = pre[i - 1] * arr[i - 1];
		}

		post[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {

			post[i] = post[i + 1] * arr[i + 1];
		}

		for (int i = 0; i < n; i++) {
			res[i] = pre[i] * post[i];
			System.out.println(res[i]);
		}

	}

	private void naiveApproach() {

		int[] arr = { 1, 2, 3, 4 };

		int[] res = new int[arr.length];

		int product = 1;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (arr[i] != arr[j]) {

					product = product * arr[j];

				}

			}

			res[i] = product;
			System.out.println("Product " + product);
			product = 1;

		}

	}

}
