package algorithms.Tree;

public class SumOfDescendent {

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
		
		t2.left = t4; t2.right = t5; t3.left = t6; t3.right = t7;

		sumofAllDesendents(t1);
		printPreorder(t1);
		
	}

	private static int sumofAllDesendents(TreeNode t1) {
		TreeNode p=t1;

		if(p==null)
		{
			return 0;
		}
		
		int oldValue = p.val;
		
		p.val = sumofAllDesendents(p.left) + sumofAllDesendents(p.right);
		
		return p.val+oldValue; 
	}
	
	
	static void printPreorder(TreeNode treeNode)
	{
	     if (treeNode == null)
	          return;
	     System.out.println(treeNode.val);
	     printPreorder(treeNode.left);
	     
	     printPreorder(treeNode.right);
	}

}
