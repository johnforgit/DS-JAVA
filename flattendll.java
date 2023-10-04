/*
program to flatten a double linked list
*/

import java.util.Scanner;

class flattendll extends cnode {
	static cnode head = null;
	
	/* function to create a new node */
	public static cnode createNode(int dat) {
		cnode newNode = new cnode();
		newNode.val = dat;
		newNode.prev = null;
		newNode.next = null;
		newNode.child = null;
	}
	
	/* function to append a node  */
	public static void append(int a) {
		cnode node = createNode(a);
		if(head == null)
			head = node;
		else {
			cnode temp = head;
			while(temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
	}
	
	/* function to add a child */
	public static void addChild(int parent,int child) {
		cnode node = createNode(child); // create the child node
		cnode temp = head;
		while(temp.val != parent)
			temp = temp.next;
		temp.child = node;
	}
	
	/* function to flatten a node */
	public static void flatten(cnode head) {
		cnode temp = head;
		while(temp != null) {
			if(temp.child != null) {
				temp.next = child;
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("  Enter the number of nodes: ");
		int n = sc.nextInt();
		for(int i = 1;i <= n;i++) {
			System.out.print("  Enter node: ")
			int a  = sc.nextInt();
			append(a);
		}
		
	}
}
