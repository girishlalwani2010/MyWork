
public class MakingPalindrom {

	public static void main(String[] args) {
		 String str = "haggg";//"abcda";
		 
		 findLCS(str, str.length());
		/* System.out.println(findLCS(str, str.length()));
		 char[] lcs = findLCS(str, str.length());
		 
		 int charNeededForPalindrom = str.length() - lcs.length;
		 
		 if(charNeededForPalindrom==0)
		 {
			 System.out.println("Palindrom is:" + str);
		 }
		 
		 else
		 {
			 char middleChar = lcs[(lcs.length)/2];
			 
			 //lcs
		 }*/
		  
		  

	}
	
	// LCS based function to find minimum number of insersions
		static void findLCS(String str, int n)
		{
		   StringBuffer original = new StringBuffer(str);
		   StringBuffer rev = new StringBuffer(str);;
			   
		  // return (n - lcs(str, rev, n, n));
		   
		   lcs(original, rev.reverse(), n, n);
		}
	
	static void lcs( StringBuffer str, StringBuffer rev, int m, int n )
	{
	  System.out.println("String is :: "+str);
	  System.out.println("Its Reverse is :: "+rev);
		
		int L[][] = new int[n+1][n+1];
	  // int i, j;
	 
	   /* Following steps build L[m+1][n+1] in bottom up fashion. Note
	      that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
	   for (int i=0; i<=m; i++)
	   {
	     for (int j=0; j<=n; j++)
	     {
	       if (i == 0 || j == 0)
	         L[i][j] = 0;
	 
	       else if (str.charAt(i-1) == rev.charAt(j-1))
	         L[i][j] = L[i-1][j-1] + 1;
	 
	       else
	         L[i][j] = max(L[i-1][j], L[i][j-1]);
	     }
	   }
	 
	   printLCSTable(L,m,n);
	   
	   for(int i=0; i<n; i++)
	   {
		   if((L[i][n]+1) == L[i+1][n])
			   continue;
		   else
		   {
			  char characterAppendingStart = rev.charAt(i-1);
			  int startIndexForAppendingChars = str.lastIndexOf(""+characterAppendingStart);
			  str.insert(startIndexForAppendingChars+1, rev.charAt(i));
		   }
			   
	   }
	   
	   System.out.println(str);
	  //System.out.println(output);
	}
	
	
	
	
	
	
	private static void printLCSTable(int[][] array, int m, int n) {
		
		for(int i=0; i<m+1; i++)
		{
			for(int j=0; j<n+1; j++)
			{
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		
		
	}

	static int max(int a, int b)
	{   return (a > b)? a : b; }
	
	
	
	
	

}
