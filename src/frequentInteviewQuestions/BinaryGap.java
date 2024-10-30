package com;
//Given a positive integer n, find and return the longest distance between any two adjacent 1's in the binary representation of n.\
//If there are no two adjacent 1's, return 0.
//
//Two 1's are adjacent if there are only 0's separating them (possibly no 0's).
//The distance between two 1's is the absolute difference between their bit positions.\
//For example, the two 1's in "1001" have a distance of 3.

//Input: n = 22
//Output: 2
//Explanation: 22 in binary is "10110".
//The first adjacent pair of 1's is "10110" with a distance of 2.
//The second adjacent pair of 1's is "10110" with a distance of 1.
//The answer is the largest of these two distances, which is 2.
//Note that "10110" is not a valid pair since there is a 1 separating the two 1's underlined.

public class BinaryGap {
	
	public static void main(String args[]){
		int n=22;
        String binaryString  = Integer.toBinaryString(n);
        System.out.println("binaryString "+binaryString);
        int gap = 0;
        int previousOneIndex = binaryString.indexOf("1"); 
        
        for(int i=previousOneIndex+1; i<binaryString.length(); i++){
            if(binaryString.charAt(i) == '1'){
                gap = Integer.max(gap, i-previousOneIndex);
                previousOneIndex = i;
            }
        }
		System.out.println("Gap "+ gap);
	}

}
