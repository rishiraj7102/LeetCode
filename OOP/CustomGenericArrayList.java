package OOP;

public class CustomGenericArrayList<T> {
    private Object [] data;
    private static  int DEFAULT_SIZE=10;
    private int size=0;


    public CustomGenericArrayList(){
        data=new Object[DEFAULT_SIZE];
    }
    public void add(T element)
    {
        if(isFull())
        {
            resize();
        }
        data[size++]=element;
    }

    private void resize() {
        Object[] arr= new Object[data.length*2];
        System.arraycopy(data, 0, arr, 0, data.length);
        data=arr;
    }

    private boolean isFull() {
        return size==data.length;
    }

    public int size()
    {
        return size;
    }



    public static void main(String[] args) {
        CustomGenericArrayList<String> list=new CustomGenericArrayList<>();
    }
}
