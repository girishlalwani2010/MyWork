package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	
	public static void main(String args[])
	{
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int noOfTestCases;
		//int i = 0;
		// wrongString, OriginalString;
		try {
			
				noOfTestCases = Integer.parseInt(bufferedReader.readLine());
				
				for(int i=0; i<noOfTestCases; i++)
				{
					String wrongString = bufferedReader.readLine(); 
					String originalString = bufferedReader.readLine();
					String operationCost[] = bufferedReader.readLine().split(" ");
					int deleteCost = Integer.parseInt(operationCost[0]);
					int insertCost = Integer.parseInt(operationCost[1]);
					int replaceCost = Integer.parseInt(operationCost[2]);
					System.out.println(calculateMinTransformationCost(wrongString,originalString,deleteCost,insertCost,replaceCost));
				}
			}
		 catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static int  calculateMinTransformationCost(String wrongString, String orginalString, int deleteCost, int insertCost, int replaceCost)
	{
		int transFormationCost = 0;
		int differenceOfChars = 0;
		int noOfInsertOperation = 0;
		int noOfDeleteOperation = 0;
		
		if(orginalString.length() == wrongString.length())
		{
			differenceOfChars = orginalString.length() - calculateMatchedChars(orginalString,wrongString);
			if(differenceOfChars==0)
				return 0;
				
			if(deleteCost+insertCost > replaceCost)
			{
				transFormationCost = differenceOfChars*replaceCost;
			}
			
			else
			{
				transFormationCost = differenceOfChars*deleteCost*insertCost;
			}
			
			return transFormationCost;
		}
		
		else
		{
			if(orginalString.length() > wrongString.length())
			{
				differenceOfChars = wrongString.length() - calculateMatchedChars(orginalString,wrongString);
				
				if(differenceOfChars != 0) {
					if(deleteCost+insertCost > replaceCost)
					{
						transFormationCost = differenceOfChars*replaceCost;
					}
					
					else
					{
						transFormationCost = differenceOfChars*(deleteCost+insertCost);
					}
				}
				
				noOfInsertOperation = orginalString.length() - wrongString.length();
				transFormationCost = transFormationCost + noOfInsertOperation*insertCost;
				return transFormationCost;
			}
				
			else
			{
				differenceOfChars = orginalString.length() - calculateMatchedChars(orginalString,wrongString);
				
				if(differenceOfChars != 0) {
					if(deleteCost+insertCost > replaceCost)
					{
						transFormationCost = differenceOfChars*replaceCost;
					}
					
					else
					{
						transFormationCost = differenceOfChars*(deleteCost+insertCost);
					}
				}
				noOfDeleteOperation = wrongString.length() - orginalString.length(); 
				transFormationCost = transFormationCost + noOfDeleteOperation*deleteCost;
				return transFormationCost;
			}
		}
		
	}


	private static int calculateMatchedChars(String wrongString,
			String orginalString) {

		String positive = orginalString.toLowerCase();
		String negative = wrongString.toLowerCase();

		/*
		 * if (positive.length() != negative.length()) { return false; }
		 */

		int[] counts = new int[26];

		int diff = 0;
		int matchedChars = 0;
		int limit;
		if(positive.length() > negative.length())
		{
			limit = positive.length(); 
		}
		else
		{
			limit = negative.length();
		}

		for (int i = 0; i < limit; i++) {

			if (i < positive.length()) {
				int pos = (int) positive.charAt(i) - 97; // convert the char
															// into an
															// array index
				if (counts[pos] >= 0) { // the other string doesn't have this
					diff++; // an increase in differences
				} else { // it does have it
					diff--;
					matchedChars++; // a decrease in differences
				}
				counts[pos]++; // track it
			}

			if (i < negative.length()) {
				int neg = (int) negative.charAt(i) - 97;

				if (counts[neg] <= 0) { // the other string doesn't have this
					diff++; // an increase in differences
				} else { // it does have it
					diff--;
					matchedChars++;// a decrease in differences
				}
				counts[neg]--; // track it
			}
		}
		return matchedChars;

		// return false;
	}
}
