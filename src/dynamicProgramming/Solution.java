package dynamicProgramming;

import java.util.*;

class Solution {
	
	public static void main(String args[]){
		
		Solution solution = new Solution();
		//solution.solution();
		//solution.checkString();
		
		solution.solution();
		
	}
	
	
	
	    int solution() {
	    	int[] A = {1,1,1,1,0,1,1,1,0,1};
	    	
	    	//int[] A = {0,0};
	        int n = A.length;
	        int i = n - 1;
	        int result = -1;
	        int k = 0, maximal = 0;
	        while (i > 0) {
	            if (A[i] == 1) {
	                k = k + 1;
	                if (k >= maximal) {
	                    maximal = k;
	                    result = k;
	                }
	            }
	            else
	                k = 0;
	            i = i - 1;
	        }
	        if (A[i] == 1 && k + 1 > maximal)
	            result = 0;
	        return result;
	    }
	

	
	
    private void checkString() {
String s1="Hello";
String s2=new String(s1);
String s3="HELLO";

System.out.println(s1.equals(s2)+""+s2.equals(s3));
	}
    int[] A= {1,1,2,3};
    
    
	/*int solution() {
    	
    	int[] A= {1,1,2,3};
    	int[] B ={2,2,3,4,5};
    	
    	int[] A= {1,3,2,1};
    	int[] B= {4,2,5,3,2};
    	
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
            if (i < m - 1 && B[i] > A[k])
                k+= 1;
            if (A[k] == B[i]){
            	System.out.println(A[k]);
                return A[k];
            }
        }
        return -1;
    }
    ;*/
int solution1() {
    	
    	int[] A= {1,1,2,3};
    	int[] B ={2,2,3,4,5};
    	
        int n = A.length;
        int m = B.length;;
        //Arrays.sort(A);
        //Arrays.sort(B);
        //int i = 0;
        for (int k = 0; k < A.length; k++) {
           
        	for(int i=0;i<B.length;i++){
        		 if (A[k] == B[i]){
                 	System.out.println(A[k]);
                     return A[k];
        		 }
        	}
        	
           
        }
        System.out.println(-1);
        return -1;
    }
}
