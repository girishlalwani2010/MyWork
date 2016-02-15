package algorithms;

import java.util.Arrays;

public class MedianOfTwoSortedArr {

	public static void main(String args[]) 
	{
		int arr1[] = {1};//1 2 12 13 15 17 26 30 38 45
		int arr2[] = {4};
		MedianOfTwoSortedArr medianOfTwoSortArr = new MedianOfTwoSortedArr();
		double median = medianOfTwoSortArr.getMedian(arr1,arr2,arr1.length);
		System.out.println(median);	
		
	}

	private double getMedian(int[] arr1, int[] arr2, int lengthofArrays) {
		 double m1,m2;
		 if (lengthofArrays <= 0)
		        return -1;
		 
		    if (lengthofArrays == 1)
		        return (arr1[0] + arr2[0])/2.0;
		 
		    if (lengthofArrays == 2)
		        return ( (arr1[0]>arr2[0] ? arr1[0]:arr2[0]) + (arr1[1]<arr2[1] ? arr1[1]:arr2[1])) / 2.0;
		 
		    m1 = median(arr1);
		    m2 = median(arr2);
		    
		    if(m1 < m2)
		    {
		    	if(lengthofArrays % 2 == 0)
		    	{
		    		arr1 = Arrays.copyOfRange(arr1,lengthofArrays/2-1,lengthofArrays);
		    		arr2 = Arrays.copyOfRange(arr2,0,lengthofArrays/2);
		    	}
		    	else
		    	{
		    		arr1 = Arrays.copyOfRange(arr1,lengthofArrays/2,lengthofArrays);
		    		arr2 = Arrays.copyOfRange(arr2,0,lengthofArrays/2+1);
		    	}
		    	return getMedian(arr1,arr2,arr1.length);	
		    }
		    
		    else
		    {
		    	if(lengthofArrays % 2 == 0)
		    	{
		    		arr2 = Arrays.copyOfRange(arr2,lengthofArrays/2-1,lengthofArrays);
		    		arr1 = Arrays.copyOfRange(arr1,0,lengthofArrays/2);
		    	}
		    	else
		    	{
		    		arr2 = Arrays.copyOfRange(arr2,lengthofArrays/2,lengthofArrays);
		    		arr1 = Arrays.copyOfRange(arr1,0,lengthofArrays/2+1);
		    	}
		    	
		    	return getMedian(arr1,arr2,arr1.length);
		    }
	}

	private double median(int[] arr) {
		
		if(arr.length%2 == 0)
		{
			return (arr[arr.length/2-1] + arr[arr.length/2])/2.0;
		}
		else{
			return arr[arr.length/2];
		}
		
	}
	
}
