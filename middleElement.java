/*
find the middle element of the linked list
*/

import java.util.Scanner;

class middleElement extends node {
	static node head = null;
	
	public static void append(int dat) {
		node newNode =  new node();
		newNode.val = dat;
		if(head == null)
			head = newNode;
		else {
			node temp = head;
			while(temp.next != null)
				temp = temp.next;
			temp.next = newNode;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n  Enter the number of nodes: ");
		int n =  sc.nextInt();
		for(int i = 1;i <= n;i++) {
			System.out.print("  Enter node: ");
			int a = sc.nextInt();
			append(a);
		}
		
		/* deleting the middle element */
		int mid = 0;
		// find the middle element
		if(n%2 == 0)
			mid = n/2;
		if(n%2 == 1)
			mid = n/2;
		node temp = head;
		for(int i = 1;i <= mid;i++) {
			temp = temp.next;
		}
		System.out.println("  "+temp.val);
		
	}
}
