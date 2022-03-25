package StacksAndQueues;

public class StackMain {
    public static void main(String[] args) throws Exception {
//        CustomStack stack=new CustomStack(5);
//        stack.insert(1);
//        stack.insert(2);
//        stack.insert(3);
//        stack.insert(4);
//        stack.insert(5);
//
////        stack.display();
//        System.out.println(stack.peek());
//        System.out.println(stack.remove());
//        System.out.println(stack.peek());
////        stack.display();


        CustomStack stack=new DynamicStack(5);
        stack.insert(1);
        stack.insert(2);
        stack.insert(3);
        stack.insert(4);
        stack.insert(5);
        stack.insert(6);

//        stack.display();
        System.out.println(stack.peek());
        System.out.println(stack.remove());
        System.out.println(stack.peek());


    }
}
