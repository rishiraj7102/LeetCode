package LinkedList;
//https://leetcode.com/problems/sort-list/
public class SortLL {
    public static void main(String[] args) {
        ListNode n1=new ListNode(3);
        ListNode n2=new ListNode(6);
        ListNode n3=new ListNode(2);
        ListNode n4=new ListNode(10);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;
        ListNode ans=sortList(n1);
        display(ans);
    }
    static void display(ListNode head)
    {
        ListNode temp=head;
        while (temp!=null)
        {
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    static ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode f=head;
        ListNode s=head;
        ListNode temp=head;

        while (f!=null && f.next!=null)
        {
            temp=s;
            f=f.next.next;
            s=s.next;
        }
//        ListNode mid=middleNode(head);
        temp.next=null;

        ListNode left=sortList(head);
        ListNode right=sortList(s);

         return mergeTwoLists(left,right);
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
    static  ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyhead=new ListNode();
        ListNode tail=dummyhead;
        while (list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }
            else {
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
        }
        while (list1 != null)
        {
            tail.next=list1;
            list1=list1.next;
            tail=tail.next;
        }
        while (list2!=null)
        {
            tail.next=list2;
            list2=list2.next;
            tail=tail.next;
        }
        return dummyhead.next;
    }
}
