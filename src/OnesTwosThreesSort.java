
public class OnesTwosThreesSort {

	private int array[] = {2,0,1,0,2,1,2,0};
	
	public static void main(String args[])
	{
		OnesTwosThreesSort onesTwosThreesSort = new OnesTwosThreesSort();
		int low=0,mid=0,high = onesTwosThreesSort.array.length -1;
		
		while(mid<=high)
		{
			switch(onesTwosThreesSort.array[mid])
			{
				case 0:
		            swap(onesTwosThreesSort,low++,mid++);
		            break;
		        case 1:
		            mid++;
		            break;
		        case 2:
		            swap(onesTwosThreesSort,mid,high--);
		            break;
			}
			
			for(int i=0; i<onesTwosThreesSort.array.length-1; i++)
			{
				System.out.print(onesTwosThreesSort.array[i]);
			}
			System.out.println();
			
		}
		
		for(int i=0; i<onesTwosThreesSort.array.length-1; i++)
		{
			System.out.print(onesTwosThreesSort.array[i]);
		}
	}

	private static void swap(OnesTwosThreesSort onesTwosThreesSort, int j,
			int i) {
		
		int temp = onesTwosThreesSort.array[j];
		onesTwosThreesSort.array[j] = onesTwosThreesSort.array[i];
		onesTwosThreesSort.array[i] = temp;
	}
	
	
}
