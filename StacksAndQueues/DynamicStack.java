package StacksAndQueues;

public class DynamicStack extends CustomStack{

//    private int  [] data;
//    private final static int  DEFAULT_SIZE=10;
//    int ptr=-1;

    DynamicStack()
    {
        super();
    }
    DynamicStack(int size)
    {
        super(size);
    }


    @Override
    public boolean insert(int item) throws Exception {
        if(this.isFull())
        {
            int [] temp=new int[data.length*2];
            for(int i=0;i<data.length;i++)
            {
                temp[i]=data[i];
            }
            ptr=data.length-1;
            data=temp;
        }
        super.insert(item);
        return true;
    }


//    private boolean isEmpty() {
//        return ptr == -1;
//    }
//
//
//    private boolean isFull() {
//        return ptr == data.length - 1;
//    }
}
