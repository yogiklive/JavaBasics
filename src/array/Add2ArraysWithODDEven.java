package com;

//Add Consecutive elements from 2 arrays into a single array
public class Add2ArraysWithODDEven {

	public static void main(String args[]) {

		int[] arrayOne = { 1, 3, 5, 7 };
		int[] arrayTwo = { 2, 4, 6, 8 };
		int[] resultArray = new int[arrayOne.length + arrayTwo.length];
		int pos = 0;

		// {1,2,3,4,5,6,7,8}

		// 0==>0
		// 1==>2
		// 2==>4
		// 3==>6

		for (int i = 0; i < arrayOne.length; i++) {

			resultArray[pos] = arrayOne[i];
			pos++;
			resultArray[pos] = arrayTwo[i];
			pos++;

		}

		for (int i = 0; i < resultArray.length; i++) {
			System.out.println(resultArray[i]);
		}
	}
}
