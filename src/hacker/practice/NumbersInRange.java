package hacker.practice;

import java.util.Scanner;

public class NumbersInRange {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// Get L and R from the input
		int L = 5;
		int R = 10;

		// Write here the logic to print all integers between L and R

		for (int i = L; i <= R; i++) {
			System.out.print(i + " ");
		}
			System.out.println();

		

		s.close();
	}
}
