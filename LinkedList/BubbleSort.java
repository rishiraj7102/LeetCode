package LinkedList;

public class BubbleSort {
    public static void main(String[] args) {
        SinglyLinkedList LL=new SinglyLinkedList();
        LL.addFirst(1);
        LL.addFirst(2);
        LL.addFirst(3);
        LL.addFirst(4);
        LL.addFirst(5);

        System.out.println(LL.size);
        LL.display();

        LL.Bubble();
        LL.display();
    }

}
