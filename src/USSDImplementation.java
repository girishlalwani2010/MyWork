import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.security.auth.Subject;


public class USSDImplementation {
	
	public static void main(String args[])
	{
		Map<String,String> hiSubOptions = new HashMap<String,String>();
		hiSubOptions.put("a","Balance");
		hiSubOptions.put("b","Prepaid");
		hiSubOptions.put("c","Last3Transactions");
		
		Map<String,String> balanceSubOptions = new HashMap<String,String>();
		balanceSubOptions.put("a","Saving");
		balanceSubOptions.put("b","Current");
		balanceSubOptions.put("c","Other");
		
		Map<String,String> prepaidSubOptions = new HashMap<String,String>();
		prepaidSubOptions.put("a","V");
		prepaidSubOptions.put("b","T");
		prepaidSubOptions.put("c","C");
		
		Map<String,String> sp1SubOptions = new HashMap<String,String>();
		sp1SubOptions.put("a","10");
		sp1SubOptions.put("b","100");
		sp1SubOptions.put("c","1000");
		
		Map<String,String> sp2SubOptions = new HashMap<String,String>();
		sp2SubOptions.put("a","15");
		sp2SubOptions.put("b","150");
		sp2SubOptions.put("c","1500");
		
		Map<String,String> sp3SubOptions = new HashMap<String,String>();
		sp3SubOptions.put("a","20");
		sp3SubOptions.put("b","200");
		sp3SubOptions.put("c","2000");
		
		Map<String,HashMap<String,String>> optionToSubOptions = new HashMap<String,HashMap<String,String>>();
		optionToSubOptions.put("hi",(HashMap<String, String>) hiSubOptions);
		optionToSubOptions.put("balance",(HashMap<String, String>) balanceSubOptions);
		optionToSubOptions.put("prepaid",(HashMap<String, String>) prepaidSubOptions);
		optionToSubOptions.put("vodacomm",(HashMap<String, String>) sp1SubOptions);
		optionToSubOptions.put("telekom",(HashMap<String, String>) sp2SubOptions);
		optionToSubOptions.put("cellc",(HashMap<String, String>) sp3SubOptions);
		
		
		Scanner scanner = new Scanner(System.in);
		
		Map<String,String> currentOptions = new HashMap<String, String>();
			
			
			//String previousMessage = "hi";
			while(scanner.hasNext())
			{	String userInput = scanner.next();
				if(userInput.equalsIgnoreCase("Hi"))
				{
					currentOptions =  optionToSubOptions.get(userInput.toLowerCase());
					System.out.println(currentOptions);
					
				}
				else
				{
					//validateOption(userInput);
					currentOptions = optionToSubOptions.get(currentOptions.get(userInput.toLowerCase()).toLowerCase());
					System.out.println(currentOptions);
				}
			}
		
		
		
	}

}
