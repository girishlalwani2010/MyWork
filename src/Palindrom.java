import java.util.ArrayList;
import java.util.List;


public class Palindrom {

	public static void main(String args[])
	{
		String word = "abdca";
		List<Character> firstHalfOfWord = new ArrayList<Character>();
		List<Character> secondHalfOfWord = new ArrayList<Character>();
		//Character firstChar = 'g';
		
		for(int i=0; i<word.length()/2;i++)
		{
			firstHalfOfWord.add(word.charAt(i));
			secondHalfOfWord.add(word.charAt(word.length()-(i+1)));
		}
		
		/*firstHalfOfWord.add(word.charAt(0));
		firstHalfOfWord.add(word.charAt(1)); //bacd
		secondHalfOfWord.add(word.charAt(3));//cdba
		secondHalfOfWord.add(word.charAt(2));
		*/
		int limit = firstHalfOfWord.size();
		for(int i=limit-1; i>=0; i--)
		{
			if (firstHalfOfWord.get(i) != secondHalfOfWord.get(i))
			{
				firstHalfOfWord.add(secondHalfOfWord.get(i));
				secondHalfOfWord.add(firstHalfOfWord.get(i));
			}
			
			else
			{
				
			}
			
		}
		
		System.out.println(firstHalfOfWord);
		System.out.println(secondHalfOfWord);
		
	}
	
}
