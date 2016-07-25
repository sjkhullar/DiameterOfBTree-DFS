package org.learn.Question;

public class DiameterOfBTree {
	int diameter = 0;

	private int diameterOfBTree(Node root) {
		if (null == root)
			return 0;

		int left = diameterOfBTree(root.left);
		int right = diameterOfBTree(root.right);
		diameter = Math.max(diameter, left + right + 1);
		return Math.max(left, right) + 1;
	}

	public int getDiameter(Node root) {
		diameterOfBTree(root);		
		int diameterTree = diameter;
		//reset diameter 
		diameter = 0;
		return diameterTree;
	}
}
