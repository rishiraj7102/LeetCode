package LinkedList;

public class CycleDetection {
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while (f!=null && f.next!=null && s!=null && s.next!=null)
        {
            f=f.next.next;
            s=s.next;
            if(f==s)
            {
                return true;
            }
        }
        return false;
    }
}
