package algorithms.Tree;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderImpl {

	public static void main(String args[]) {//[3, 4, 1, 5, 6, 2, 0]
		TreeNode t1 = new TreeNode(0);
		TreeNode t2 = new TreeNode(1);
		TreeNode t3 = new TreeNode(2);
		TreeNode t4 = new TreeNode(3);
		TreeNode t5 = new TreeNode(4);
		TreeNode t6 = new TreeNode(5);
		TreeNode t7 = new TreeNode(6);

		t1.left = t2;
		t1.right = t3;
		
		 t2.left = t4; t2.right = t5; t3.left = t6; t3.right = t7;
		 

		PostOrderImpl inOrderImpl = new PostOrderImpl();

		System.out.println(inOrderImpl.postOrderTraversal(t1));
	}

	public ArrayList<Integer> postOrderTraversal(TreeNode root) {
		ArrayList<Integer> returnList = new ArrayList<Integer>();

		if (root == null)
			return returnList;

		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode p;
		stack.push(root);
		
		TreeNode curr = null,prev=null;

		while (!stack.empty()) {
			
			p = stack.peek();

			if (p.right != null && !(p.right == prev)) {
				stack.push(p.right);
				
			}

			if (p.left != null && !(p.right == prev)) {
				stack.push(p.left);
				
			}

			else {
				curr = stack.pop();
				returnList.add(curr.val);
			
			}

			prev = p;
		}
		return returnList;
	}

}
