package LinkedList;
//https://leetcode.com/problems/linked-list-cycle-ii/
public class LinkedList2 {
    public static void main(String[] args) {

    }
    public ListNode detectCycle(ListNode head) {
            ListNode p1 = head;
            ListNode p2 = head;
            int length=cyclelength(head);
            while (length!=0)
            {
                p2=p2.next;
                length--;
            }
            while (p1!=p2)
            {
                p1=p1.next;
                p2=p2.next;
            }
            return p1;
    }
    static int cyclelength(ListNode head)
    {
//        int ans=1;
        ListNode f=head;
        ListNode s=head;
        while (f!=null && f.next!=null)
        {
            f=f.next.next;
            s=s.next;
            if(f==s)
            {
                ListNode temp=s;
                int length=0;
                do{
                    temp=temp.next;
                    length++;
                }
                while (temp!=f);
                return length;
            }
        }
//        return ans;
        return -1;
    }
}
