import java.util.Stack;


public class StackExample {
	
	public static void main(String args[])
	{
		String input = "{}()";
		System.out.println(isExpressionBalanced(input));
	}
	
	
	static boolean isExpressionBalanced(String input)
	{
		Stack<Character> stack = new Stack<Character>();
		int j=0,k=0;
		for(int i=0; i<input.length(); i++)
		{
			if(input.charAt(i)=='(' || input.charAt(i)=='{' || input.charAt(i)=='[')
			{
				stack.push(input.charAt(i));
				j++;
				continue;
			}
			
			else if(input.charAt(i)==')' || input.charAt(i)=='}' || input.charAt(i)==']')
			{
				char ch = stack.pop();
				if((ch == '(' && input.charAt(i)==')') || (ch == '{' && input.charAt(i)=='}') || ch == '[' && input.charAt(i)==']')
				{
					k++;
					continue;
				}
			}
			
			break;
			
		}
		
		if(j==k)
			return true;
		
		return false;
		
	}

}
