package algorithm.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
	
	public static void main(String args[])
	{
		System.out.println(lengthOfLongestSubstring("aab"));
	}
	
	
	
	public static int lengthOfLongestSubstring(String s) {
	    int max = 0, i = 1, j = 1;
	   // Map<String, Integer> map = new HashMap<String, Integer>(); 
	    char[] charArray = new char[256];
	    while (j-1 < s.length()) {
	        char st = s.charAt(j-1);
	        System.out.println("Before ::"+(int)charArray[st]);
	        if (((int)charArray[st]) > 0  && ((int)charArray[st]) >= i-1)
	            i = charArray[st] + 1;
	        
	        charArray[st] = (char) (++(j) - 1);
	        System.out.println((int)charArray[st]);
	      //  sy
	       // map.put(st, j++);
	        max = max > ((j-1) - (i-1)) ? max : ((j-1) - (i-1));
	    }
	    return max;
	}

}
