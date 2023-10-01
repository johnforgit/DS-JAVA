/*
program to flatten a double linked list
*/

import java.util.Scanner;

class flattendll extends cnode {
	static cnode head = null;
	
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
	}
}
