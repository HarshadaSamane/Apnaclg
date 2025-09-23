public class PalindromeLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void print () {
        if(head == null) {
            System.out.println("LL is Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    } 

    //Slow-Fast Approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;    //+1
            fast = fast.next.next;   //+2
        }
        return slow; //slow is the mid
    }

    public boolean checkPalindrome() {
        //base case
        if( head == null || head.next == null ) {
            return true;
        }

        //Step1: find mid
        Node midNode = findMid(head);

        //Step2: reverse the ll
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;   //right half head
        Node left = head;

        //Step3: check left half and right half
        while (right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;

        }

        return true;
    }
    public static void main(String[] args) {
        PalindromeLL ll = new PalindromeLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        
        ll.print();
        System.out.println(ll.checkPalindrome());
    }
}
