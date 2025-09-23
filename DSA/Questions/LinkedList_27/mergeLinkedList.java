
public class mergeLinkedList {

    public static class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    } 

    public static Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void print() {
        if (head == null) {
            return;
        }

        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    //FIND THE MID 
    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while ( head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    //ZIG-ZAG CODE

    public void zigZag () {
        //find mid
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        //2nd half reverse
        Node curr = mid.next;
        mid.next = null;

        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        Node nextL, nextR;

        //alternate merge

        while( right != null && left != null ) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    //MERGE SORT CODE
    public Node mergeSort(Node head) {

        if(head == null || head.next == null) {
            return head;
        }

        //find mid
        Node mid = getMid(head);

        //sort left & right half
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    //MAIN CLASS
    public static void main(String[] args) {
        mergeLinkedList ll = new mergeLinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print();
        // ll.head = ll.mergeSort(ll.head);
        // ll.print();

        ll.zigZag();
        ll.print();
    }
}
