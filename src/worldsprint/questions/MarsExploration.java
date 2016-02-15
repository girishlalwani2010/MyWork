package worldsprint.questions;

public class MarsExploration {
	
	public static void main(String args[])
	{
		//String SOS = "sos";
		int numberOfAlteredChars = 0;
		String S = "SOSSPSSQSSOR";
		for(int i=0 ;i<S.length(); i++)
		{
			if((i+1)%3 == 1)
			{
				if(!(S.charAt(i) == 'S'))
				{
					numberOfAlteredChars++;
				}
			}
			else if((i+1)%3 == 2)
			{
				if(!(S.charAt(i) == 'O'))
				{
					numberOfAlteredChars++;
				}
			}
			else if((i+1)%3 == 0)
			{
				if(!(S.charAt(i) == 'S'))
				{
					numberOfAlteredChars++;
				}
			}
		}
		
		System.out.println(numberOfAlteredChars);
				
	}

}
