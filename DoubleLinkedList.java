/*
double linked list in java
*/

import java.util.Scanner;

class DoubleLinkedList extends Node {
	static Node head = null;
	
	/* add to the end of the linked list */
	public static void append(int a) {
			Node newNode = new Node();
			newNode.val = a;
			newNode.prev = null;
			newNode.next = null;
			if(head == null)
				head = newNode;
			else {
				Node temp = head;
				while(temp.next != null)
					temp = temp.next;
				temp.next = newNode;
				newNode.prev = temp;
			}
	}
	
	/* add in a position of the linked list */
	public static void insert(int pos,int dat) {
		
		/* create a new node */
		Node newNode = new Node();
		newNode.val = dat;
		newNode.prev = null;
		newNode.next = null;
		
		/* insert at the specified position */
		Node temp = head;
		for(int i = 1;i < pos-1;i++) // move the temp node to the specified position
			temp = temp.next;
		newNode.next = temp.next; // rearranging
		temp.next.prev = newNode;
		temp.next = newNode;
		newNode.prev = temp;
		
	}
	
	/* display the linked list */
	public static void print() {
		Node temp = head;
		System.out.print("  DOUBLE LINKED LIST: ");
		while(temp != null) {
			System.out.print(temp.val);
			if(temp.next != null)
				System.out.print("->");
			temp = temp.next;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n  Enter the no of nodes: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n;i++) {
			System.out.print("  Enter node: ");
			int a  = sc.nextInt();
			append(a);
		}
		print();
		System.out.println();
		insert(3,6);
		print();
		System.out.println();
				
	}
}
