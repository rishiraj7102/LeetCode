package OOP;
//whenever we create an object of a class, all the static members are the ones to get initialized first
//but theres a catch
// the static block runs only for one time, when the object id created for the first time
// after that, even if you create objs again and again, the static block wont get executed
public class StaticBlock {
    static  int a =4;
    static  int b;

    static {                                                //static block
        System.out.println("Inside static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj=new StaticBlock();
        System.out.println(StaticBlock.a+" " + StaticBlock.b);

        StaticBlock.b+=3;
        System.out.println(StaticBlock.a+" " + StaticBlock.b);

        StaticBlock obj2=new StaticBlock();
        System.out.println(StaticBlock.a+" " + StaticBlock.b);
    }
}
