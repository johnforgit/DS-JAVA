/*
addition of two numbers using linked list
< ,
*/

import java.util.Scanner;

class linkedAdd extends node {
	
	static node headA = null;
	static node headB = null;
	
	public static void appendA(int dat) {
		node newNode = new node();
		newNode.val = dat;
		if(headA == null)
			headA = newNode;
		else {
			node temp = headA;
			while(temp.next != null)
				temp = temp.next;
			temp.next = newNode;
		}
	}
	
	public static void appendB(int dat) {
		node newNode = new node();
		newNode.val = dat;
		if(headB == null)
			headB = newNode;
		else {
			node temp = headB;
			while(temp.next != null)
				temp = temp.next;
			temp.next = newNode;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n  ADDITION OF TWO NUMBERS USING LINKED LIST\n");
		System.out.print("  Enter two numbers: ");
		int nA = 0,nB = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		while(a > 0) {
			int A = a % 10;
			appendA(A);
			A /= 10;
		}
		while(b > 0) {
			int B = b % 10;
			appendB(B);
			B /= 10;
		}
		
		node temp = headA;
		while(temp != null) {
			System.out.print(temp.val);
			temp = temp.next;
		}
		
		node t = headB;
		while(t != null) {
			System.out.println(t.val);
			t = t.next;
		}
		
	}
	
	
}
