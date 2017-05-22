/**
 *
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null
 * Note: Do not modify the linked list.
 *
 * Follow up:
 * Can you solve it without using extra space?
 */
public class LinkedListCycleII {
    /**
     * 紧跟着第一题，这题不光要求出是否有环，而且还需要得到这个环开始的节点。譬如下面这个，起点就是n2。
     * n6-----------n5
     * |            |
     * n1--- n2---n3--- n4|
     * 我们仍然可以使用两个指针fast和slow，fast走两步，slow走一步，判断是否有环，当有环重合之后，譬如上面在n5重合了，那么如何得到n2呢？
     * 首先我们知道，fast每次比slow多走一步，所以重合的时候，fast移动的距离是slot的两倍，我们假设n1到n2距离为a，n2到n5距离为b，n5到n2距离为c
     * ，fast走动距离为a + b + c + b，而slow为a + b，有方程a + b + c + b = 2 x (a + b)，可以知道a = c，所以我们只需要在重合之后，
     * 一个指针从n1，而另一个指针从n5，都每次走一步，那么就可以在n2重合了。
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null)
            return null;
        ListNode stepOne=head;
        ListNode stepTwo=head;
        while(stepTwo.next!=null&&stepTwo.next.next!=null){
            stepOne=stepOne.next;
            stepTwo=stepTwo.next.next;
            //n5
            if(stepOne==stepTwo){
                stepOne=head;
                while(stepOne!=stepTwo){
                    stepOne=stepOne.next;
                    stepTwo=stepTwo.next;
                }
                return stepOne;
            }

        }
        return null;
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
