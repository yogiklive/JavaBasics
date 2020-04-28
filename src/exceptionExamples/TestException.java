package exceptionExamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestException {
	
	public static void main(String args[]){
		
		/*String s = null;
		s.toString();//Here the program stops abruptly with out handling the exception
		System.out.println("after Exception");*/
		
		try{
			String s1 = null;
			s1.toString();
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("after Exception"); //Exception is handled the program continues to execute
	
		
	/*File file = new File("sample.txt");
	BufferedReader bf = new BufferedReader(new FileReader(file));*/
	
	}

}
