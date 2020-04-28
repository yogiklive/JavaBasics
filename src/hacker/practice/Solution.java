package hacker.practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("inside main " +args);
    	try{
        int N = scanner.nextInt();
        System.out.println("value of N " +N);
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N % 2 == 0 && (N >= 2 && N <= 5) ){
           System.out.println("Not Wired");
        }else if(N % 2 ==0 &&(N >=6 && N <= 20)){
           System.out.println("Wired");
        }else{
            System.out.println("Not Wired");
        }
    	}catch(Exception e){
    		System.out.println( e.toString());
    	}
        scanner.close();
        
    }
}

