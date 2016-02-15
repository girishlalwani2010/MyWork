import java.util.ArrayList;
import java.util.List;


public class PascalTriangle {
	
	public static void main(String args[])
	{
		System.out.println(getRow(3));
	}
	
	public static List<Integer> getRow(int rowIndex) {
		
		int numberToBeReturn = (int) Math.pow(11, rowIndex);
		List<Integer> list = new ArrayList<Integer>(); 
		
		while(numberToBeReturn>0)
		{
			list.add(numberToBeReturn%10);
			numberToBeReturn = numberToBeReturn/10;
		}
		
		return list;
	        
	}
	
}
