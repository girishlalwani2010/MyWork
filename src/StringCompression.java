
public class StringCompression {

	public static void main(String args[])
	{
		String input = "abcccdddddd";
		int count =1;
		for(int i=0;i<input.length();i++)
		{
			char currentChar = input.charAt(i);
			
			if(((i+1) != input.length()) && (input.charAt(i+1) == currentChar))
			{
				count++;
				//System.out.println();
			}
			else
			{
				System.out.print(currentChar+""+count);
				count=1;
			}
		}
	}
	
}
