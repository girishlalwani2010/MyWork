package worldsprint.questions;

import java.util.Scanner;

public class PluseOFGoodCells {
	
	public static void main(String[] args) {
		//int n=5,m=6;
		
		/*int [][]charArray = {{'G','G','G','G','G','G'},
		 {'G','B','B','B','G','B'},
		 {'G','G','G','G','G','G'},
		 {'G','G','B','B','G','B'},
		 {'G','G','G','G','G','G'},
		};*/
		
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m = in.nextInt();
	        char charArray[][] = new char[n][m];
	        for(int i=0; i <n ; i++){
	           String words = in.next();
	        for (int j=0; j<words.length(); j++)
	            charArray[i][j]=words.charAt(j);
	        }
		
		int rightMove,leftMove,topMove,bottomMove,numberOfPlus=0,product=1;
		int k=0;
		for(int i=1;i<charArray.length-1; i++)
		{
			for(int j=1;j<charArray[i].length-1;j++)
			{
				if(charArray[i][j] == 'G')
				{
					rightMove = (charArray[0].length -1 - j);
					leftMove = (j-0);
					topMove = i-0;
					bottomMove = charArray.length - 1 - i;
					
					if(isPlusPatterExist(charArray,i,j,leftMove,rightMove,topMove,bottomMove) && k<2)
						{
						
						int minimumMove = Math.min(Math.min(Math.min(topMove, bottomMove), rightMove),leftMove);
						int plusLength = minimumMove*4+1;
						product = product*plusLength;
						k++;
						}	
				}
			}
		}
			
		System.out.println(product);
	}

	private static boolean isPlusPatterExist(char[][] charArray,int i, int j, int leftMove, int rightMove,
			int topMove, int bottomMove) {
		
		
		
		//int k=0;
		while(bottomMove>0)
		{
			if(!(charArray[i+bottomMove][j] == 'G'))
			{
				return false;
			}
			
			bottomMove--;
		}
		
		while(topMove>0)
		{
			if(!(charArray[i-topMove][j] == 'G'))
			{
				return false;
			}
			
			topMove--;
		}
		
		while(rightMove>0)
		{
			if(!(charArray[i][j+rightMove] == 'G'))
			{
				return false;
			}
			
			rightMove--;
		}
		

		while(leftMove>0)
		{
			if(!(charArray[i][j-leftMove] == 'G'))
			{
				return false;
			}
			
			leftMove--;
		}
		
		
		
		return true;
	}

}
