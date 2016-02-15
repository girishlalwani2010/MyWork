
public class KnapsackImpl {

	public static void main(String args[])
	{
		int prices[] = {6,4,5,3,9,7};
		int weights[] = {4,2,3,1,6,4};
		int knapsackCapacity = 10;
		int[][] dpTable = new int[weights.length+1][knapsackCapacity+1];
		boolean[][] keep = new boolean[weights.length+1][knapsackCapacity+1];
		
		for(int i=1; i<=weights.length; i++)
		{
			for(int w=1; w<=knapsackCapacity;w++)
			{
				if(weights[i-1]>w)
				{
					dpTable[i][w] = dpTable[i-1][w];
				}
				
				else
				{
					int pNo = dpTable[i-1][w];
					int pYes = prices[i-1] + dpTable[i-1][w-weights[i-1]];
					if(pYes > pNo)
					{
						dpTable[i][w] = pYes;
						keep[i-1][w] = true;
					}
					
					else
					{
						dpTable[i][w] = pNo;
					}
				}
				
				
				
			}
		}
		
	}

}
