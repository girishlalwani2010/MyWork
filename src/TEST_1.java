import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TEST_1 {
	public static void main(String args[]) {
		

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
		try {
				line = br.readLine();
	        int noOFTestCases = Integer.parseInt(line);
	        int noOfDays;
	        String input,output = null;
	        if(noOFTestCases>=1 && noOFTestCases<=100)
	        {
		        for (int i = 0; i < noOFTestCases; i++) {
		            input = br.readLine();
		            noOfDays = Integer.parseInt(br.readLine());
		            
		            if(input.length()>=1 && input.length()<=100000 && noOfDays>=0 && noOfDays<=10000)
		            {  output = input;	
		               noOfDays = noOfDays*(noOfDays+1)/2;
		            	
							if ((noOfDays%2)!=0) {
								int nTimes =noOfDays;
								
								while (nTimes > 0) {
									output = output.replaceAll("0", "x")
											.replaceAll("1", "0")
											.replaceAll("x", "1");
									
									nTimes--;
								}
							
						}
			            //System.out.println(output);
			            int noOfBitSet=0;
			            
			            if(noOfDays%2!=0)
			            {
				            for(int j=0; j<output.length(); j++)
				            {
				            	if(input.charAt(j)=='0' && output.charAt(j) == '1')
				            	{
				            		noOfBitSet++;
				            	}
				            }
				            System.out.println(noOfBitSet);
			            }
			            
			            else
			            {
			            	System.out.println("0");
			            }
			            
			            
		            }
		            else
		            {
		            	System.out.println("0");
		            }
		            
		        }
	        
	        }
	        
	        else
	        {
	        	System.out.println("0");
	        }

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
