/*
program to perform polynomial addition
*/

import java.util.Scanner;

class PolyAdd extends PolyNode {
	static PolyNode headA = null;
	static PolyNode headB = null;
	
	/* creates a new node for the polynomial */
	public static PolyNode createNode() {
		PolyNode newNode = new PolyNode();
		Scanner sc = new Scanner(System.in);
		System.out.print("  Enter coefficient: ");
		int c = sc.nextInt();
		newNode.coeff = c;
		System.out.print("  Enter exponent: ");
		int e = sc.nextInt();
		newNode.exp = e;
		newNode.next = null;
		return newNode;
	}
	
	/* adds the new node at the end of the polynomial */
	public static void appendPoly(PolyNode head) {
		PolyNode newNode = createNode();
		if(head == null)
			head = newNode;
		else {
			PolyNode temp = head;
			while(temp.next != null)
				temp = temp.next;
			temp.next = newNode;
		}
	}
	
	/* adds the two polynomials */
	
	
	/* displays the polynomial */
	public static void display(PolyNode head) {
		PolyNode temp = head;
		while(temp != null) {
			System.out.print(temp.coeff+"x^"+temp.exp);
			if(temp.next != null)
				System.out.print("+");
			temp = temp.next;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("  Enter Polynomial 1\n");
		while(true) {
			System.out.print("\n  Enter term - 1");
			System.out.print("\n  Exit - 0");
			System.out.print("\n  -> ");
			int ch = sc.nextInt();
			if(ch == 1) {
				appendPoly(headA);
			}
			else
				break;
		}
		display(headA);
		System.out.println();
		System.out.print("  Enter Polynomial 2\n");
		while(true) {
			System.out.print("\n  Enter term - 1");
			System.out.print("\n  Exit - 0");
			System.out.print("\n  -> ");
			int ch = sc.nextInt();
			if(ch == 1) {
				appendPoly(headB);
			}
			else
				break;
		}
		
		// polynomial is not getting appended to the end. need to check on that
	}
}
