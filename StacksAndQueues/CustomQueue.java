package StacksAndQueues;

public class CustomQueue {
    protected int [] data;
//    protected int f=0;
    protected int e=0;
    protected final static int DEFAULT_SIZE=10;
    CustomQueue()
    {
        data=new int[DEFAULT_SIZE];
    }
    CustomQueue(int size)
    {
        data=new int[size];
    }

    public void insert(int item) throws Exception {
        if(isFull())
        {
            throw new Exception("Queue full");
        }
        data[e++]=item;
    }
    public int remove() throws Exception{
        if(isEmpty())
        {
            throw new Exception("queue empty");
        }
        int item=data[0];
        for (int i=1;i<data.length;i++)
        {
            data[i-1]=data[i];
        }
        e--;
        return item;
    }
    public int front() throws Exception {
        if (isEmpty())
        {
            throw new Exception("stack empty");
        }
        return data[0];
    }
    public void display() {
        for (int i = 0; i < e; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }
    protected boolean isEmpty() {
        return e==0;
    }

    protected boolean isFull() {
        return e == data.length;
    }


}
