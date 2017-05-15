/**
 * No.206
 * Reverse a singly linked list.
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if(head.next==null||head==null) return head;
        ListNode nextNode=head.next;
        ListNode newHead=reverseList(nextNode);
        nextNode.next=head;
        head.next=null;
        return newHead;


    }


    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
