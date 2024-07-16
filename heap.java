import java.util.ArrayList;

class heap 
{
    static ArrayList<Integer>heap = new ArrayList<Integer>();

    static void insert(int val)
    {
        /** Method to nsert a value into a heap. Ensure value is inserted as per heap conditions
         * @param val takes an integer as input
         */
        heap.add(val);
        int child = heap.size() - 1;
        int parent = (child - 1)/2;
        while(parent >= 0 && heap.get(parent) > heap.get(child)) {
            // swap parent and child
            swap(parent, child);
            val = parent;
            parent = (child - 1)/2;
        }
    }

    static void remove()
    {
        /** Method to remove a value from a heap
         */
        int last = heap.remove(heap.size() - 1);
        heap.set(0, last);
        int parent = 0;
        int leftChild = 0, rightChild = 0, minChild;
        while(true) {
            leftChild = (2 * parent) + 1;
            rightChild = (2 * parent) + 2;

            if(leftChild >= heap.size()) {
                /*
                 * if the item has moved down the tree so it has no children. this is a terminating condition
                 */
                break;
            }
            minChild = leftChild; // assume the least child is the left child

            if(rightChild < heap.size() && heap.get(rightChild) < heap.get(leftChild)) {
                /*
                 * when right child is less than the left child and it's within the tree
                 * make min child as right child
                 */
                minChild = rightChild;
            }

            if(heap.get(parent) > heap.get(minChild)) {
                /*
                 * when the parent is greater than the child since it's initializationa as the heap's first element
                 * swap parent and min child(initialized as right child)
                 */
                swap(parent, minChild);
                parent = minChild;
            }
            else {
                /*
                 * breaking out of the loop when the above if condition fails
                 */
                break;
            } 
        }
    }

    static void swap(int p, int c) {
        int temp = heap.get(p);
        heap.set(p, heap.get(c));
        heap.set(c, temp);
    }

    public static void main(String args[])
    {
        insert(10);
        System.out.println(heap);
        insert(0);
        System.out.println(heap);
        insert(2);
        System.out.println(heap);
        insert(8);
        System.out.println(heap);
        insert(9);
        System.out.println(heap);
        insert(23);
        System.out.println(heap);
        remove();
        System.out.println(heap);
        System.out.println();
    }
}
