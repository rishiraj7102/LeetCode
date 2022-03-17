package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this block will always run");
        }
        System.out.println(divide(5,0));
        customexception();

    }
    public static int divide (int a,int b) throws ArithmeticException
    {
        if(b==0)
        {
            throw new ArithmeticException("division by zero not possible");
        }
        return a/b;
    }
    public static void customexception() {
        try {
            String name = "rishabh";
            if (name.equals("rishabh"))
            {
                throw new MyException("name is rishabh. please change");
            }
        }

        catch (MyException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
