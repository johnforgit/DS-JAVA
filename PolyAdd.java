/*
program to perform polynomial addition
*/

import java.util.Scanner;

class PolyAdd extends PolyNode {
	static PolyNode headA = null;
	static PolyNode headB = null;
	
	public static PolyNode create(int pow,int coef) {
		PolyNode newNode = new PolyNode();
		newNode.exp = pow;
		newNode.coeff = coef;
		newNode.next = null;
		return newNode;
	}
	
	// public static void append()
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
	}
}
