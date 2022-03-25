package LinkedList;
//https://leetcode.com/problems/middle-of-the-linked-list/submissions/
public class MiddleOfLL {
    public static void main(String[] args) {
    }
    static ListNode middleNode(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while (f!=null && f.next!=null)
        {
            f=f.next.next;
            s=s.next;
        }
        return s;
    }
}
