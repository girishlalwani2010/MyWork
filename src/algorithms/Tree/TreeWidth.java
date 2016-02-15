package algorithms.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeWidth {
	
	public static void main(String args[])
	{
		TreeNode root = new TreeNode(0);
		TreeNode t2 = new TreeNode(1);
		TreeNode t3 = new TreeNode(2);
		TreeNode t4 = new TreeNode(3);
		TreeNode t5 = new TreeNode(4);
		TreeNode t6 = new TreeNode(5);
		TreeNode t7 = new TreeNode(6);
		TreeNode t8 = new TreeNode(7);
		TreeNode t9 = new TreeNode(8);
		
		root.left = t2;
		root.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.left = t6;
		t3.right = t7;
		t4.left = t7;
		t4.right = t8;
		
		System.out.println(getMaxWidth(root));
	}

	public static int getMaxWidth(TreeNode root) {
	    Queue<TreeNode> row = new LinkedList<>();
	    row.add(root);
	    row.add(null); // use null as a marker for the end of a row.
	    int maxwidth = 1;
	    while (!row.isEmpty()) {
	        TreeNode n = row.remove();
	        if (n == null) {
	            // next row
	            int rowsize = row.size();
	            if (rowsize > 0) {
	                if (rowsize > maxwidth) {
	                    maxwidth = rowsize;
	                }
	                row.add(null); // add new end-of-row-marker.
	            }
	        } else {
	            if (n.left != null) {
	                row.add(n.left);
	            }
	            if (n.right != null) {
	                row.add(n.right);
	            }
	        }
	    }
	    return maxwidth;
	} 

}
