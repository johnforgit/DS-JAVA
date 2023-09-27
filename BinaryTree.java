/*
create a binary tree in java
*/

import java.util.Scanner;

class BinaryTree extends TreeNode {

	static TreeNode root = null;
	
	public static TreeNode createNode(int dat) {
		TreeNode newNode = new TreeNode();
		newNode.val = dat;
		newNode.left = null;
		newNode.right = null;
		if(root == null) {
			root = newNode;
			return root;
		}
		else
			return newNode;
	}
	
	public static void insert(int n,TreeNode node,char ch) {
		if(node == root) /* do nothing */
		else {
			TreeNode temp = root;
			while(temp != null) {
				if(temp.val != n)
					if(temp.right != null)
						temp = temp.right;
					else if(temp.left != null)
						temp = temp.left;
			}
			if(ch == 'l') temp.left = node;
			else temp.right = node;
		}
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int ch;
		int ch1;
		char op;
		while(true) {
			System.out.print("\n  1.Enter node");
			System.out.print("\n  2.Exit");
			ch = sc.nextInt();
			switch(ch) {
				case 1:
					System.out.print("  Enter node to insert after: ");
					ch1 = sc.nextInt();
					System.out.print("  Left child or right: ");
					op = sc.nextLine.charAt(0);
					System.out.print("\n  Enter node: ");
					int n = sc.nextInt();
					TreeNode node = createNode(n);
					
			}
		}
	}
}
