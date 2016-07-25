package org.learn.Client;

import org.learn.Question.DiameterOfBTree;
import org.learn.Question.Node;

public class App {
	public static void main(String[] args) {
		// Level 0
		Node A = Node.createNode(70);
		// Level 1
		Node B = Node.createNode(40);
		Node C = Node.createNode(80);
		// Level 2
		Node D = Node.createNode(70);
		Node E = Node.createNode(40);
		Node F = Node.createNode(80);
		Node G = Node.createNode(80);
		// Level 3
		Node H = Node.createNode(70);
		Node I = Node.createNode(40);
		Node J = Node.createNode(80);
		// Level 4
		Node K = Node.createNode(70);
		Node L = Node.createNode(40);
		Node M = Node.createNode(80);
		Node N = Node.createNode(80);

		// Connect level 0 to level 1
		A.left = B;
		A.right = C;
		// Connect level 1 to level 2
		B.left = D;
		B.right = E;
		C.left = F;
		C.right = G;
		// Connect level 2 to level 3
		D.left = H;
		D.right = I;
		E.right = J;
		// Connect level 2 to level 3
		H.left = K;
		H.right = L;
		J.left = M;
		J.right = N;

		DiameterOfBTree objDiameter = new DiameterOfBTree();
		System.out.println("1. Diameter at Node K is : " + objDiameter.getDiameter(K));
		System.out.println("2. Diameter at Node H is : " + objDiameter.getDiameter(H));
		System.out.println("3. Diameter at Node D is : " + objDiameter.getDiameter(D));
		System.out.println("4. Diameter at Node B is : " + objDiameter.getDiameter(B));
		System.out.println("5. Diameter of Binary Tree is : " + objDiameter.getDiameter(A));
	}
}
