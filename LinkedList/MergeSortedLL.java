package LinkedList;
//https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeSortedLL {
    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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
        return dummyhead;
    }
//    public void addLast(int val)  //function to add an element at the last
//    {
//        if(tail==null)
//        {
//            addFirst(val);
//            return;
//        }
//        SinglyLinkedList.Node temp=new SinglyLinkedList.Node(val);
//        tail.next=temp;
//        temp.next=null;
//        size++;
//    }
}
