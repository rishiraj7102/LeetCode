package StacksAndQueues;

public class CustomStack {
    protected int  [] data;
    protected final static int  DEFAULT_SIZE=10;
    int ptr=-1;

    CustomStack()
    {
        data=new int[DEFAULT_SIZE];
    }
    CustomStack(int size)
    {
        data=new int[size];
    }
    public boolean insert(int item) throws Exception {
        if(isFull())
        {
            throw new Exception("Stack is full. cant insert more elements");
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int remove() throws Exception {
        if(isEmpty())
        {
            throw new Exception("Stack is empty. cant remove any item");
        }
        else {
            int item=data[ptr];
            ptr--;
            return item;
        }

    }
    public int peek() throws Exception
    {
        if (isEmpty())
        {
            throw new Exception("stack empty");
        }
        return data[ptr];
    }

    public boolean isEmpty() {
        return ptr == -1;
    }


    public boolean isFull() {
        return ptr == data.length - 1;
    }



}
