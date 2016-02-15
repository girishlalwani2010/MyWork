import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CarNames {

	public static void main(String[] args) {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		int noOfNames = 0;
		boolean flag;
		
		int i=0;
			try {
				while((line = in.readLine()) != null) {
					if(noOfNames+1<=0)
						break;
					
					if(i==0)
					{
						noOfNames = Integer.parseInt(line);
					}
					if(i>=1)
					{flag = false;
					    
						
						if(line.length()%3 == 0)
						{	StringBuilder sb = new StringBuilder(line);
							
							for(int j=0;j<sb.length();j=j+line.length()/3)
							{
								if(!ispalindrom(sb.substring(j, j+line.length()/3)))
								{
									
									flag=false;
									break;
								}
								else
								{
									flag=true;
									continue;
								}
								
							}
							
							
						}
						if(flag)
							System.out.println("OK");
						else
							System.out.println("Not OK");
						
					}
					noOfNames--;
					
				i++;
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

}

	private static boolean ispalindrom(String string) {
		
		 int n = string.length();
		    
		    for (int i = 1; i < n; ++i) {
		        if (string.charAt(0) != string.charAt(i)) {
		            return false;
		        }
		    }
		    return true;
		
	}
	
}
