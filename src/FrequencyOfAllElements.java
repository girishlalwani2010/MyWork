
public class FrequencyOfAllElements {

	public static void main(String args[])
	{
		int array[] = {2,3,1,2};
		findCounts(array,array.length);
		
	}
	
	
	static void  findCounts(int []arr, int n)
	{
	    // Traverse all array elements
	    int i = 0;
	    while (i<n)
	    {
	        // If this element is already processed,
	        // then nothing to do
	        if (arr[i] <= 0)
	        {
	            i++;
	            continue;
	        }
	 
	        // Find index corresponding to this element
	        // For example, index for 5 is 4
	        int elementIndex = arr[i]-1;
	 
	        // If the elementIndex has an element that is not
	        // processed yet, then first store that element
	        // to arr[i] so that we don't loose anything.
	        if (arr[elementIndex] > 0)
	        {
	            arr[i] = arr[elementIndex];
	 
	            // After storing arr[elementIndex], change it
	            // to store initial count of 'arr[i]'
	            arr[elementIndex] = -1;
	        }
	        else
	        {
	            // If this is NOT first occurrence of arr[i],
	            // then increment its count.
	            arr[elementIndex]--;
	 
	            // And initialize arr[i] as 0 means the element
	            // 'i+1' is not seen so far
	            arr[i] = 0;
	            i++;
	        }
	    }
	 
	    System.out.println("\nBelow are counts of all elements\n");
	    for (int i1=0; i1<n; i1++)
	        System.out.printf("%d -> %d\n", i1+1, Math.abs(arr[i1]));
	}
}
