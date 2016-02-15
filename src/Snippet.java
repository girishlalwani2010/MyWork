public class Snippet {
	
	
	public static void main(String args[])
	{
	
	String s;
	String t;
	
	
	int count[] = new int[26]; 
	
	for(int i=0; i<s.length(); i++)
	{
		count[s.charAt(i)-97]++;
	}
	
	for(int i=0; i<t.length(); i++)
	{
		count[t.charAt(i)-97]--;
	}
	
	for(int i=0; i<count.length; i++)
	{
		if(count[i]!=0)
		{
			return false;
		}
	}
	
	return true;
}}