/*
create a binary tree in java
*/

import java.util.Scanner;

class BinaryTree extends TreeNode {
	static TreeNode root = null;
	public static createNode(int dat) {
		TreeNode newNode = new TreeNode(dat);
		newNode.left = null;
		newNode.right = null;
		return newNode;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
	}
}
