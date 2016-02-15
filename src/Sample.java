import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sample {

	public static void main(String args[])
	{
		int[] arr = new int[100000];
		int i=0;
		int line1 = 2;
		int count =0;
		int totalElements =0;
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     try {
			while(br.readLine()!=null)
			 {	 
				String line = br.readLine();
				String lwine[] = line.split("\\s+");
			    for(String s: lwine)
			    {
			    	totalElements++;
			    	arr[i]++; 
			    }
			    i++;
			    totalElements--;
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
			System.out.println(fact(totalElements)/(fact((arr.length-1))*fact((arr.length-1))));
		
		
		
	}
	
	public static int fact(int N){
		int ans = 1;
		//for i = 1 to N
		for(int i=1; i<=N; i++)
		   ans = ans*i;
		return ans;
	}
	

	
}
