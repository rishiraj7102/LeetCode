package LinkedList;

public class CircularLL {

    Node head;
    Node tail;
    int size;
     CircularLL()
     {
         this.size=0;
     }
     public void insert(int val)
     {
         Node node = new Node(val);
         if (head == null) {
             head = node;
             tail = node;
             return;
         }

         tail.next = node;
         node.next = head;
         tail = node;

     }

     public void delete(int val)
     {
        Node node=head;
        if(node == null)
        {
            return;
        }
        if(node.val==val)
        {
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n=node.next;
            if(n.val==val)
            {
                node.next=n.next;
                break;
            }
            node=node.next;
        }
        while (node!=head);
     }
     public void display()
     {
         Node temp=head;
         do
         {
             System.out.print(temp.val+"->");
             temp=temp.next;
         }
         while (temp!=head);
//         System.out.print("->"+head.val);
     }
    class Node{
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
