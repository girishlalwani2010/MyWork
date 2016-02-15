package algorithms.MS;

public class ProdExceptMatchIndexII {

	public static void main(String args[])
	{
		int arrA[] = {1,2,3,4};
		int rightProduct[] = new int [arrA.length]; 
		int leftProd[] = new int [arrA.length]; 
		rightProduct[arrA.length-1] = 1;
		leftProd[0] = 1;
		for(int i=arrA.length-1; i>0; i--)
		{
			rightProduct[i-1]=arrA[i]*rightProduct[i];
		}
		
		
		for(int i=0; i<arrA.length-1; i++)
		{
			leftProd[i+1]=arrA[i]*leftProd[i];
		}
		
		for(int i=0; i<arrA.length; i++)
		{
			System.out.println(leftProd[i]*rightProduct[i]);
		}
		
		
	}
	
}
