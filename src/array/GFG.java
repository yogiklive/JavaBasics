package array;


public class GFG  
{ 
    static final int NO_OF_CHARS = 100; 
      
    // finds the second most frequently occurring  
    // char 
    static char getSecondMostFreq(String str) 
    { 
        // count number of occurrences of every 
        // character.  
        int[] count = new int[NO_OF_CHARS]; 
        int i; 
        for (i=0; i< str.length(); i++) 
            (count[str.charAt(i)])++; 
        System.out.println(count.toString());
        // Traverse through the count[] and find 
        // second highest element. 
        int first = 0, second = 0; 
        for (i = 0; i < NO_OF_CHARS; i++) 
        { 
            /* If current element is smaller than 
            first then update both first and second */
        	System.out.println(count[i]);
            if (count[i] > count[first]) 
            { 
                second = first; 
                first = i; 
            } 
       
            /* If count[i] is in between first and 
            second then update second  */
            else if (count[i] > count[second] && 
                     count[i] != count[first]) 
                second = i; 
        } 
       
        return (char)second; 
    } 
       
    // Driver program to test above function 
    public static void main(String args[]) 
    { 
      String str = "eeksforgeeks"; 
      char res = getSecondMostFreq(str); 
      if (res != '\0') 
         System.out.println("Second most frequent char"+ 
                                       " is " + res); 
      else
         System.out.println("No second most frequent"+ 
                                       "character"); 
    } 
} 
// This code is contributed by Sumit Ghosh 
