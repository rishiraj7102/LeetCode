package LinkedList;

public class ReverseLLinaRange {
    public static void main(String[] args) {

    }
//    static boolean isPalindrome(ListNode head) {
//        ListNode f=head;
//        ListNode s=head;
//        int left=1;
//        int right=1;
//        while (f!=null && f.next!=null)
//        {
//            f=f.next.next;
//            s=s.next;
//            left++;
//            right+=2;
//        }
//        ListNode mid=s;
//        ListNode start=head;
//        head=reverseBetween(head,left,right);
//        while (mid!=null && mid.next!=null)
//        {
//            if(start.val!=mid.val)
//            {
//                return false;
//            }
//            start=start.next;
//            mid=mid.next;
//        }
//        return true;
//
//    }
//    public void reverseLLinPlace(ListNode head)
//    {
//        ListNode prev=null;
//        ListNode pres=head;
//        ListNode next=pres.next;
//
//        while (pres!=null)
//        {
//            pres.next=prev;
//            prev=pres;
//            pres=next;
//            if(next!=null)
//                next=next.next;
//        }
//        head=prev;
//    }
    static ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null)
        {
            return head;
        }
        if(left==right)
        {
            return head;
        }
        ListNode prev=null;
        ListNode current=head;
        for(int i=0;current!=null && i<left-1 ;i++)
        {
            prev=current;
            current=current.next;
        }
        ListNode last=prev;
        assert current != null;
        ListNode next=current.next;
        ListNode newEnd=current;
        for(int i=0;i<right-left+1;i++)
        {
            assert current != null;
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null)
                next=next.next;
        }
        if(last==null)
        {
            head=prev;
        }
        else {
            last.next=prev;
        }
        newEnd.next=current;
        return head;
    }
}
