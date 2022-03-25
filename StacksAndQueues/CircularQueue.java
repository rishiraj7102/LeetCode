package StacksAndQueues;

public class CircularQueue {
    protected int [] data;
    protected int front=0;
    protected int end=0;
    int size=0;
    protected final static int DEFAULT_SIZE=10;

    CircularQueue()
    {
        this(DEFAULT_SIZE);
    }
    CircularQueue(int size)
    {
        data=new int[size];
    }

    public boolean insert(int item) throws Exception
    {
        if(isFull())
        {
            throw new Exception("queue is full");
        }
        data[end++]=item;

        end=end% data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty())
        {
            throw new Exception("queue is empty");
        }
        int item=data[front++];
        front=front%data.length;
        size--;
        return item;
    }
    public int front() throws Exception{
        if(isEmpty())
        {
            throw new Exception("queue empty");
        }
        int item=data[front];
        return item;
    }

    public void display()  throws Exception {
        if (isEmpty()) {
            throw new Exception("queue is empty");
        }
        int i=front;
        do{
            System.out.print(data[i]+"<-");
            i++;
            i=i%data.length;

        }while (i!=end);
        System.out.print("end");
        System.out.println();
    }


    protected   boolean isFull()
    {
        return size==data.length;
    }
    protected boolean isEmpty ()
    {
        return size==0;
    }
}
