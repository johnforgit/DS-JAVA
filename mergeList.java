/*
 * merge two sorted lists into a single linked lists
 */

class Listnode
{
    int data;
    Listnode next;

    Listnode() {};
    Listnode(int val) {
        this.data = val;
        this.next = null;
    }
    Listnode(int val, Listnode Next) {
        this.data = val;
        this.next = Next;
    }
}


class mergeList {
    static Listnode A = null;
    static Listnode B = null;

    public static void main(String args[])
    {
        Listnode a1, a2, a3;
        Listnode b1, b2, b3;
        a1 = new Listnode(1);
        a2 = new Listnode(2);
        a3 = new Listnode(3);
        a1.next = a2;
        a2.next = a3;
        a3.next = null;
        A = a1;

        b1 = new Listnode(2);
        b2 = new Listnode(4);
        b3 = new Listnode(5);
        b1.next = b2;
        b2.next = b3;
        b3.next = null;
        B = b1;
        show(A);
        System.out.println();
        show(B);
        System.out.println();
        Listnode mergedHead = merge(A,B);
        show(mergedHead);
        System.out.println();
    }

    static Listnode merge(Listnode head1, Listnode head2)
    {
        Listnode curr1 = head1;
        Listnode curr2 = head2;
        Listnode dummy = new Listnode();
        Listnode temp = dummy;
        while (curr1 != null && curr2 != null) {
                if(curr1.data < curr2.data) {
                    temp.next = curr1;
                    temp = curr1;
                    curr1 = curr1.next;
                }
                else {
                    temp.next = curr2;
                    temp = curr2;
                    curr2 = curr2.next;
                }

                // if there is ony a single list
                if(curr1 != null) temp.next = curr1;
                else temp.next = curr2;    
        }
        return dummy.next;
    }

    static void show(Listnode head)
    {
        Listnode curr = head;
        while(curr != null) {
            System.out.print(curr.data);
            if(curr.next != null)
                System.out.print("->");
            curr = curr.next;
        }
    }
    

    
}
