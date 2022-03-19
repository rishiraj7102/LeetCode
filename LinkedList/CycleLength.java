package LinkedList;

public class CycleLength {
    public static void main(String[] args) {

        // 1->2->3->4->5
        //        --^   |
        //       |      |
        //       8<-7<-6
        //
        //
        ListNode node1=new ListNode(8);
        ListNode node2=new ListNode(7,node1);
        ListNode node3=new ListNode(6,node2);
        ListNode node4=new ListNode(5,node3);
        ListNode node5=new ListNode(4,node4);
        ListNode node6=new ListNode(3,node5);
        ListNode node7=new ListNode(2,node6);
        ListNode node8=new ListNode(1,node7);
        node1.next=node5;
        System.out.println(cyclelength(node8));
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
