package Hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test {

	
	public static void main(String args[])
	{
		int noOfOperations = 0;
		StringBuilder inputString = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     try {
	    	 	int i=0;
	    	 	String line = br.readLine();
				while(line!=null)
				 {	 
					
					String words[] = line.split("\\s+");
					if(i==0)
					{
						//lengthOfString = Integer.parseInt(words[0]);
						noOfOperations = Integer.parseInt(words[1]);
					}
					
					else if(i==1)
					{
						inputString = new StringBuilder(words[0]);
					}
						
					else{
						
						if(Integer.parseInt(words[0]) == 1)
						{
							int leftLimit = Integer.parseInt(words[1]);
							int rightLimit = Integer.parseInt(words[2]);
							int kthChar = Integer.parseInt(words[3]);
							String retrievedSubString = inputString.substring(leftLimit-1,rightLimit);
							sortRetrievedString(retrievedSubString);
							if(kthChar > retrievedSubString.length()-1)
							{
								System.out.println(retrievedSubString.charAt(kthChar-1));
							}
							System.out.println(retrievedSubString.charAt(kthChar-1));
						}
						
						else if(Integer.parseInt(words[0]) == 0)
						{
							int insertPosition = Integer.parseInt(words[1]);
							String updatingWith = words[2];
							
							inputString.replace(insertPosition-1, insertPosition-1, updatingWith);
						}
						
						
					}
					i++;
					if(i == noOfOperations+2)
						break;
					line = br.readLine();
				 }

	     }
	     catch(Exception e)
	     {
	    	 
	     }
	     
	}

	private static void sortRetrievedString(String retrievedSubString) {
		Arrays.sort(retrievedSubString.toCharArray());
		
		
	}
}