package hacker.practice;

import java.util.Scanner;

public class AddTwoArrays {

	public static void main(String[] args) {
		
		/*Scanner s = new Scanner(System.in);
		
		// Reading integer from input
		int N = s.nextInt();*/
		
		int[] numArrayA = {1,2,3};
		int[] numArrayB = {1,2,3};
		int[] sumArray = new int[3];
		
	/*	// Read numArray1
		for(int i=0; i<N; i++) {
			numArrayA[i] = s.nextInt();
		}
		// Read numArray2
		for(int i=0; i<N; i++) {
			numArrayB[i] = s.nextInt();
		}*/
		
		// Write your logic here:
		System.out.println( "Before actual logic ");
		for(int i=0;i<numArrayA.length;i++){
			sumArray[i] = numArrayA[i] + numArrayB[i];
		}
				
		// Print the sumArray
		for(int i=0; i<sumArray.length; i++) {
			System.out.println(sumArray[i] + " ");
		}
        
        System.out.println();
		//s.close();

	}

}