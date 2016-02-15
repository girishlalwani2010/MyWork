package algorithms.MS;

public class ProdExceptMatchIndex {

	public static void main(String args[])
	{
		int arrA[] = {1,2,3,4};
		int product = 1; 
		for(int i=0; i<arrA.length;i++)
		{
			product = product*arrA[i];
		}
		
		int[] arrB = new int[arrA.length];
		for(int i = 0; i<arrA.length; i++)
		{
			arrB[i] = product/arrA[i];
			System.out.print(arrB[i]+" ");
		}
		
		
	}
	
	
}
