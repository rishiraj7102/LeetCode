package OOP;
public class CustomArraylist {
    private int [] data;
    private static  int DEFAULT_SIZE=10;
    private int size=0;


    public CustomArraylist(){
        data=new int[DEFAULT_SIZE];
    }
    public void add(int element)
    {
        if(isFull())
        {
            resize();
        }
        data[size++]=element;
    }

    private void resize() {
        int[] arr= new int[data.length*2];
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
        CustomArraylist list=new CustomArraylist();
//        System.out.println(list.size());
//        list.add(1);
//        list.add(10);
//        list.add(4);
//        System.out.println(list.size());
        for (int i = 0; i < 14; i++) {
            list.add(2*i);
        }
        System.out.println(list.size());
    }

}
