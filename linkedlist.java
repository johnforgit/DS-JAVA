/** superclass */

class node
{
	int info;
	node next;
}

/** subclass */

class linkedlist extends node
{
	static node head=null; // pointer to head
	
	/** insert a node at the beginning of the list */
	static void insertBegin(int val){
		node newNode=new node();
		newNode.info=val;
		if(head==null){
			head=newNode;
			newNode.next=null;
		}
		else{
			newNode.next=head;
			head=newNode;	
		}
	}
	
	/** insert a node at a position */
	static void insert(int val,int pos){
		node newNode=new node();
		newNode.info=val;
		if(head==null){
			head=newNode;
			newNode.next=null;
		}
		else{
			node temp=head;
			while(temp.info!=pos) temp=temp.next;
			newNode.next=temp.next;
			temp.next=newNode;
			
		}
	/** There are various ways to insert a node in between a list. this is one such method
	You can use a for loop also to traverse the nodes to reach ur required position, and then
	make the necessary object reference adjustments */
	}
	
	/** deletes a node from the list */
	static void deleteBegin(){
		int val;
		node temp=head;
		if(temp==null) System.out.println(" EMPTY LIST");
		else{
			val=temp.info;
			head=temp.next;
			temp=null;
		}
		//return val;
	}
	
	/** deletes a node from any position */
	static void delete(int val){
		node temp=head;
		if(temp==null) System.out.println(" EMPTY LIST");
		else{
			node ptr=head;
			while(temp.info!=val){
				ptr=temp;
				temp=temp.next;
			}
			ptr.next=temp.next;
			temp=null;
		}
	}
	
	/** display the list */
	static void display(){
		node temp=head;
		if(temp==null)
			System.out.println("\n  EMPTY LIST!!");
		else{
			while(temp!=null){
				System.out.print("  "+temp.info+"->");
				temp=temp.next;
			}
		}
	}
	
	public static void main(String args[])
	{
		display();
		insertBegin(5);
		insertBegin(6);
		insertBegin(12);
		insert(7,6);
		display();
		System.out.println();
		deleteBegin();
		display();
		delete(5);
		System.out.println();
		display();
		System.out.println();
	}
}


