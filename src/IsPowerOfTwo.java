
public class IsPowerOfTwo {

	public static void main(String args[])
	{
		System.out.println(isPowerOfTwo(5));
	}

	 public  static boolean isPowerOfTwo(int n) {
		 
		
		 
		 while(n>2)
		 {
			 
			 if(n%2 !=0)
			 {
				 return false;
			 }
			 
			 n=n/2;
			 
		 }
		 
		 if(n==1 || n==2)
			 return true;
		 
		 return false;
	        
	    }
	
}
