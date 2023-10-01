/*
another way of implementing the double linked list
*/

import java.util.Scanner;

class DLL extends Node {
	static Node head = null;
	static Node tail = null;
	static int size = 0;
	
	public static void addAtIndex(int index, int dat) {
		if(index < 0 || index > size)
			return;
		Node newNode = new Node();
		newNode.val = dat;
		Node temp = head;
		for(int i = 1;i < index - 1;i++)
			temp = temp.next;
		newNode.next = temp.next;
		temp.next.prev = newNode;
		temp.next = newNode;
		newNode.prev = temp;
		size++;
	}
	
	public static void addAtHead(int dat) {
		addAtIndex(0,dat); // add at the head of the linked list
	}
	
	public static void addAtTail(int dat) {
		addAtIndex(size,dat); // add at the tail of the linked list
	}
	
	public static void printForward() { // prints the linked list in the forward manner
		System.out.print("  Double Linked List: ");
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val);
			if(temp.next != null)
				System.out.print("->");
			temp = temp.next;
		}
	}
	
	public static void printReverse() {
		System.out.print("  Double Linked List: ");
		Node temp = tail;
		while(temp != null) {
			System.out.print(temp.val);
			if(temp.prev != null)
				System.out.print("->");
			temp = temp.prev;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node h = new Node();
		h.val = 1;
		head = h;
		h.prev = null;
		Node t = new Node();
		tail = t;
		t.val = 1;
		h.next = t;
		t.prev = h;
		t.next = null;
		System.out.print("\n  DOUBLE LINKED LIST");
		System.out.print("\n  ------------------");
		System.out.print("\n\n  Enter the no of nodes: ");
		int n = sc.nextInt();
		for(int i = 1;i <= n;i++) {
			System.out.print("  Enter node: ");
			int a = sc.nextInt();
			addAtHead(a);
		}
		printForward();
		System.out.println();
		addAtIndex(3,5);
		printForward();
		addAtIndex(4,10);
		printForward();
		System.out.println();
		addAtTail(25);
		printForward();
		printReverse();
		System.out.println();
	}
}
