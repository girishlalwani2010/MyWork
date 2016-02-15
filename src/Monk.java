import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Monk {

	
	public static void main(String args[])
	{
		
		int arrSize = 0,noOfQueries;
		int[] arr = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			
			int i=0;
			while((line = in.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line," "); 
			    if(i==0)
			    {	
			    arrSize = Integer.parseInt(st.nextToken());
			    arr = new int[arrSize];
			   
			    }
			    else if(i==1)
			    {
			    	
			    		
			    	for(int j=0; st.hasMoreTokens(); j++)
			    	{
			    		
			    		arr[j] = Integer.parseInt(st.nextToken());
 			    	}
			    }
			    else
			    {
			    	int find = Integer.parseInt(line);
			    	boolean flag = false;
			    	for(int k=0; k<arrSize/2; k++)
			    	{
			    		if(arr[k] == find)
				    	{
			    			flag=true;
			    			break;
				    	}
				    	
			    		
			    	}
			    	for(int k=arrSize/2; k<arrSize; k++)
			    	{
			    		if(arr[k] == find)
				    	{
			    			flag=true;
			    			break;
				    	}
				    	
			    		
			    	}
			    	if(flag)
			    	{
			    		System.out.println("YES");
			    	}
			    	else
			    	{
			    		System.out.println("NO");
			    	}
			    	
			    		
			    }
			    
			  i++;  
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
