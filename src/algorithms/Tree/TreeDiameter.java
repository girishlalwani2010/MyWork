package algorithms.Tree;

public class TreeDiameter {

	public static void main(String args[])
	{
		TreeNode t1 = new TreeNode(0);
		TreeNode t2 = new TreeNode(1);
		TreeNode t3 = new TreeNode(2);
		/*TreeNode t4 = new TreeNode(3);
		TreeNode t5 = new TreeNode(4);
		TreeNode t6 = new TreeNode(5);
		TreeNode t7 = new TreeNode(6);*/

		t1.left = t2;
		t1.right = t3;
		
		/* t2.left = t4; t2.right = t5; t3.left = t6; t3.right = t7;*/
		 

		TreeDiameter treeDiameter = new TreeDiameter();

		System.out.println(treeDiameter.getDiameter(t1)[0]);
	}
	
	public static int[] getDiameter(TreeNode root) {
	    int[] result = new int[]{0,0};    //1st element: diameter, 2nd: height    
	    if (root == null)  return result;
	    int[] leftResult = getDiameter(root.left);
	    int[] rightResult = getDiameter(root.right);
	    int height = Math.max(leftResult[1], rightResult[1]) + 1;
	    int rootDiameter = leftResult[1] + rightResult[1] + 1;
	    int leftDiameter = leftResult[0];
	    int rightDiameter = rightResult[0];
	    result[0] = Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
	    result[1] = height;
	    

	    return result;
	}
}
