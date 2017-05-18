import java.util.HashSet;
import java.util.Set;

/**
 * No.83
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 *
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }else{
            if(set!=null&&set.contains(head.val)){
                head=deleteDuplicates(head.next);
            }else{
                set.add(head.val);
                head.next=deleteDuplicates(head.next);
            }
        }

        return head;
    }
    private Set<Integer> set=new HashSet<>();
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
