package LinkedList;

public class PalindromeLL {
    public static void main(String[] args) {

    }
    static boolean isPalindrome(ListNode head) {
        ListNode mid=middleNode(head);
        ListNode reversehead=reverseLLinPlace(mid);
        ListNode finalreversehead=reversehead;
        while (mid!=null && reversehead!=null)
        {
            if(head.val!=reversehead.val)
            {
                return false;
            }
            head=head.next;
            reversehead=reversehead.next;
        }
        reverseLLinPlace(finalreversehead);
        return false;


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
    static ListNode reverseLLinPlace(ListNode head)
    {
        ListNode prev=null;
        ListNode pres=head;
        ListNode next=pres.next;

        while (pres!=null)
        {
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null)
                next=next.next;
        }

        return prev;
    }
}
