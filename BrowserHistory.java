/*
program to implement browser history
*/

import java.util.Scanner;

class BrowserHistory extends Bnode {
	static Bnode homepage = null;
	
	public static void visit(String url) {
		Bnode newNode = new Bnode;
		newNode.site = url;
		newNode.prev = null;
		newNode.next = null;
	}
	
	public static String back(int steps) {
		Bnode temp = homepage;
	}

	public static void main(String args[]) {
		
	}
}
