/*
double linked list in java
*/

import java.util.Scanner;

class DoubleLinkedList {
	static Node head = null;
	
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
	
	public static void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val);
			if(temp.next != null)
				System.out.print("->");
			temp = temp.next;
		}
	}
	
	public static void main(String args[]) {
		
	}
}
