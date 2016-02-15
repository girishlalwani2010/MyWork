package algorithms.amazon;

public class AlternatePosAnNeg {

	public static void main(String args[])
	{
		int arr[] = {2,-3,-1,-5,6,-7,8,9,-1,10};
		//           2 -3 10 -5 6 -7 8 -1 9 -1 
		int i = 0,j=arr.length-1; 
		AlternatePosAnNeg alternatePosAnNeg = new AlternatePosAnNeg();
		while(i < j)
		{
			if((i%2==1) && arr[i]>0)
			{
				if(arr[j]>0)
				{
					j--;
					continue;
				}
				else
				{
					alternatePosAnNeg.swap(arr, i, j);
				}
			}
			
			else if((i%2==0) && arr[i]<0)
			{
				if(arr[j]<0)
				{
					j--;
					continue;
				}
				else
				{
					alternatePosAnNeg.swap(arr, i, j);
				}
				
			}
			i++;
		}
		
		alternatePosAnNeg.printArray(arr);
	}

	private void printArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
