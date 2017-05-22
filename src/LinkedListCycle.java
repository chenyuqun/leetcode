import java.util.List;

/**
 * No.141
 * Given a linked list, determine if it has a cycle in it.
 * <p>
 * Follow up:
 * Can you solve it without using extra space?
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null)
            return false;
        ListNode stepOne=head;
        ListNode stepTwo=head;
        while(stepTwo.next!=null&&stepTwo.next.next!=null){
            stepOne=stepOne.next;
            stepTwo=stepTwo.next.next;
            if(stepOne==stepTwo)
                return true;
        }
        return false;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
