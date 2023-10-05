/*
program to flatten a double linked list
*/

import java.util.Scanner;

class flattendll extends cnode {
	static cnode head = null;
	
	/* create a new node */
	public static cnode createNode(int dat) {
		cnode newNode = new cnode();
		newNode.val = dat;
		newNode.prev = null;
		newNode.next = null;
		newNode.child = null;
		return newNode;
	}
	
	/* append a node  */
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
	
	/* add a child to a node */
	public static void addChild(int parent,int child) {
		cnode node = createNode(child); // create the child node
		cnode temp = head;
		while(temp.val != parent)
			temp = temp.next;
		temp.child = node;
	}
	
	/* flatten the linked list */
	public static void flatten(cnode Head) {
		cnode curr = Head;
		while(curr != null) {
			if(curr.child != null) {
				cnode Next = curr.next; // mark the next node of the current node
				cnode Child = curr.child; // mark the child of the current node
				curr.next = Child;
				curr.child = null;
				cnode temp = Child; // checking whether the child has any nodes attached to it
				while(temp.next != null)
					temp = temp.next;
				temp.next = Next; // travel to the end of the child and set the Next node of the linked list
			}
			curr = curr.next; // move onto the next node
		}
	}
	
	/* display the linked list */
	public static void display() {
		cnode temp = head;
		while(temp != null) {
			System.out.print(temp.val);
			if(temp.next != null)
				System.out.print("->");
			temp = temp.next;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("  Enter the number of nodes: ");
		int n = sc.nextInt();
		for(int i = 1;i <= n;i++) {
			System.out.print("  Enter node: ");
			int a  = sc.nextInt();
			append(a);
		}
		display();
		
		/* adding children*/
		for(int i = 1;i <= 3;i++) {
			System.out.print("\n  Enter parent and child: ");
			int p = sc.nextInt();
			int c = sc.nextInt();
			addChild(p,c);
		}
		flatten(head);
		display();
		System.out.println();
	}
}
