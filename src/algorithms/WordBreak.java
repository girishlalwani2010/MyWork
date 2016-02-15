package algorithms;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordBreak {

	public static void main(String[] args) {
		HashSet<String> dict = new HashSet<String>();
		dict.add("special");
		dict.add("goal");
		dict.add("goals");
		dict.add("go");
		
		WordBreak wb = new WordBreak();
	 
		System.out.println(wb.wordBreak("rtspecial",dict));
		
		/*StringBuilder sb = new StringBuilder();
	 
		for(String s: dict){
			sb.append(s + "|");
		}
	 
		String pattern = sb.toString().substring(0, sb.length()-1);
		pattern = "("+pattern+")*";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher("goalspecial");
	 
		if(m.matches()){
			System.out.println("match");
		}*/
	}
	
	 public boolean wordBreak(String s, Set<String> dict) {
	     return wordBreakHelper(s, dict, 0);
	 }

	public boolean wordBreakHelper(String s, Set<String> dict, int start){
	    if(start == s.length()) 
	        return true;
	
	    for(String a: dict){
	        int len = a.length();
	        int end = start+len;
	
	        //end index should be <= string length
	        if(end > s.length()) 
	            continue;
	
	        if(s.substring(start, start+len).equals(a))
	            if(wordBreakHelper(s, dict, start+len))
	                return true;
	    }
	
	    return false;
	}

}
