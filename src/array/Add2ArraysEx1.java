package com;

//Add one array to another array
public class Add2ArraysEx1 {

	public static void main(String args[]) {

		int[] arrayOne = { 1, 2, 3, 4 };
		int[] arrayTwo = { 6, 7, 8, 9 };
		int[] resultArray = new int[arrayOne.length + arrayTwo.length];
		int pos = 0;

		for (int i = 0; i < arrayOne.length; i++) {
			resultArray[pos] = arrayOne[i];
			pos++;

		}
		for (int i = 0; i < arrayTwo.length; i++) {
			resultArray[pos] = arrayTwo[i];
			pos++;

		}
		
		for(int i =0; i<resultArray.length;i++){
			System.out.println(resultArray[i]);
		}
	}
}
