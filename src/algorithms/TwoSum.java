package algorithms;
import java.util.HashMap;
import java.util.Map;


public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		int[] finalArr = new int[]{-1,-1};
		
		for(int i=0; i<nums.length; i++)
		{
			int diff = target - nums[i];
			//int val = nums[i];
			
			if(map.containsKey(nums[i]))
			{
				//nums = new int[2];
				finalArr[0] = map.get(nums[i]) + 1;
				finalArr[1] = i + 1 ;
				return finalArr;		
 			}
			
			map.put(diff,i);
		}
		
		
		
		return finalArr;
    }
	
	public static void main(String[] args) {
		
		TwoSum twoSum = new TwoSum();
		int[] nums = {3,2,4};
		nums =twoSum.twoSum(nums,6);
		System.out.println(nums[0]+","+nums[1]);
		

	}

}
