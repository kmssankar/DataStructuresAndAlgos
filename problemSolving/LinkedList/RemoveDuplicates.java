package LinkedList;

public class RemoveDuplicates {



     class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode deleteDuplicates(ListNode head) {

         if (head == null) return head;

         ListNode returnHead = null;
         ListNode current = null;

         ListNode startPointer = head;
         int val = head.val;
         int count = 1;
         while (startPointer.next != null) {
             if(!(startPointer  == head)) {

                 if(startPointer.val == val) {
                     count++;
                 }else{
                     if(count == 1) {
                         ListNode newNode = new ListNode(val);
                        if(returnHead == null) {
                            returnHead = newNode;
                            current = newNode;
                        }else{
                            current.next = newNode;
                            current = current.next;
                        }

                     }
                     val = startPointer.val;
                     count = 1;
                 }

             }
             startPointer = startPointer.next;

         }
         if(count == 1) {
             ListNode newNode = new ListNode(val);
             if(returnHead == null) {
                 returnHead = newNode;
             }else{
                 current.next = newNode;
             }
         }

         return  returnHead;
    }
}
