/*
flatten binary tree to linked list in pre order
*/

import java.util.Scanner;

class flattenBinaryTree extends TreeNode {
	static TreeNode root = null;
	
	public static TreeNode createNode(int val) {
		TreeNode newNode = new TreeNode();
		newNode.val = val;
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}
	
	public static void flatten(TreeNode Root) {
		if(Root == null) return;
		
		TreeNode curr = Root;
		TreeNode Left = curr.left;
		TreeNode Right = curr.right;
		if(Left != null) {
			curr.right = Left;
			curr.left = null;
			flatten(Left);
		}
		else
			flatten(Right);
	}
	
	public static void display() {
		TreeNode temp = root;
		System.out.print("  Flattened Binary Tree: ");
		while(temp != null)
			System.out.print(temp.val);
			if(temp.right != null)
				System.out.print("->");
			temp = temp.right;
	}
	
	public static void main(String args[]) {
		root = createNode(1);
		TreeNode n1 = createNode(2);
		TreeNode n2 = createNode(3);
		root.left = n1;
		root.right = n2;
		TreeNode n3 = createNode(4);
		TreeNode n4 = createNode(5);
		n1.left = n3;
		n1.right = n4;
		TreeNode n5 = createNode(6);
		TreeNode n6 = createNode(7);
		n2.left = n5;
		n2.right = n6;
		flatten(root);
		display();
	}
}
