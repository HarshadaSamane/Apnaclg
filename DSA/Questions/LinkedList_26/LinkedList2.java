public class LinkedList2 {

    Node head;

    // Node class
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Add node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete nth node from end
    public void deleteNthFromEnd(int n) {
        // Step 1: calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // Step 2: if need to remove first node
        if (n == sz) {
            head = head.next;
            return;
        }

        // Step 3: find previous node of the node to be deleted
        int iToFind = sz - n;
        int i = 1;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        // Step 4: delete the node
        prev.next = prev.next.next;
    }

    // Print the linked list
    public void print() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

        // Current List: 1 -> 2 -> 3 -> 4
        ll.print();

        ll.deleteNthFromEnd(3);  // delete 2nd node from start, i.e., 2
        ll.print();              // Expected: 1 -> 3 -> 4
    }
}
