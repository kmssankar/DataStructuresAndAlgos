package LinkedList;

public class ReverseLinkedListII {

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(left == right) return head;

        ListNode replaceStart = null;
        ListNode replaceEnd = null;
        int nodeProcessed = 0;
        ListNode previous = null;

        //get the nodes for reversing
        while (head != null) {
            nodeProcessed++;
            if(nodeProcessed == left) replaceStart = head;
            if(nodeProcessed == right) replaceEnd = head;
            head = head.next;
        }




    return head;

    }
}
