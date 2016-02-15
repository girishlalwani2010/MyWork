package algorithm.number;

public class ReverseNumber {
	
	public static void main(String args[])
	{
	  System.out.println(reverse(1534236469));
	}								

	private static int reverse(int x) {
		  long rev_number=0;
		  int multiplier = 1;
		  while(x!=0)
		  {
			  int remainder = x%10;
			  rev_number = rev_number*10 + remainder;
			  x = x/10;
		  }
		  
		  if(rev_number > Integer.MAX_VALUE || rev_number < Integer.MIN_VALUE)
		   return 0;
		  
		 return (int)rev_number;	  
	}
	
	

}
