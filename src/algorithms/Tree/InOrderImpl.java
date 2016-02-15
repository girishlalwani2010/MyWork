package algorithms.Tree;

import java.util.ArrayList;
import java.util.Stack;

public class InOrderImpl {

	public static void main(String args[])
	{
		
		TreeNode t1 = new TreeNode(0);
		TreeNode t2 = new TreeNode(1);
		TreeNode t3 = new TreeNode(2);
		TreeNode t4 = new TreeNode(3);
		TreeNode t5 = new TreeNode(4);
		TreeNode t6 = new TreeNode(5);
		TreeNode t7 = new TreeNode(6);
		
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		
		InOrderImpl inOrderImpl = new InOrderImpl();
		
		System.out.println(inOrderImpl.inorderTraversal(t1));
	}
	
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> returnList = new ArrayList<Integer>();
 
        if(root == null)
            return returnList;
 
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
 
        while(!stack.empty() || p!=null){
 
            if(p != null){
                stack.push(p);
                p=p.left;
            }
            
            else
            {
            	TreeNode t = stack.pop();
            	returnList.add(t.val);
            	p=t.right;
            }
 
        }
        return returnList;
    }
	
}
