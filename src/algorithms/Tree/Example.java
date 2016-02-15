package algorithms.Tree;

import java.math.BigInteger;

public class Example {

	public static void main(String args[])
	{
		int inputArray[] = {};
		int[] ouputArray = coins_value(inputArray);
		System.out.println(ouputArray[0]+" "+ouputArray[1]);
	}
	
	private static int gcd(int a, int b) {
		  int r;
		  while(b!=0){
		    r = a % b;
		    a = b;
		    b = r;
		  }
		  return a;
		}
	
	public static int[] coins_value(int[] input1)
    {
		int outputArray[] = {0,0};
		
		
		if(input1.length!=2)
		{
			return outputArray;
		}
		
		if ((input1[0]<0 || input1[0]>1000) || (input1[1]<0 || input1[1]>1000) || (input1[0] == 0 && input1[1] == 0)) {
			return outputArray;
		}
		
		if(input1[0] == 0)
		{
			outputArray[1] = 1; 
			return outputArray;
		}
		
		if ((input1[1] == 0) || (input1[0] == input1[1])) {
			outputArray[0] = 1;
			return outputArray;
		}
		
		int gcd = gcd(input1[0],input1[1]);
		BigInteger temp;
		
		if(input1[0]<input1[1])
		{
			temp=BigInteger.valueOf(input1[0]/(gcd)).modInverse(BigInteger.valueOf(input1[1]/gcd));
			outputArray[0]=temp.intValue();
			outputArray[1]=(gcd - input1[0]*outputArray[0])/input1[1];
		}
		else
		{
			temp=BigInteger.valueOf(input1[1]/gcd).modInverse(BigInteger.valueOf(input1[0]/(gcd)));
			outputArray[1]=temp.intValue();
			outputArray[0]=(gcd - input1[1]*outputArray[1])/input1[0];
		}
		
		
		return outputArray;
    }
	
}
