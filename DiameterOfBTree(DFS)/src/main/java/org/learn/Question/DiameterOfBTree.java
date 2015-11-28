
package org.learn.Question;
import org.learn.PrepareTree.Node;

public class DiameterOfBTree {
	int diameter = 0;
	public int diameterOfBTree(Node root) {
		if(null == root)
			return 0;
		
		int left = diameterOfBTree(root.left);
		int right = diameterOfBTree(root.right);
		diameter = Math.max(diameter,left+right+1);
		return Math.max(left,right) + 1;		
	}
	public int getDiameter() {
		return this.diameter;
	}
}
