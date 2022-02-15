public class scope {
    public static void main(String[] args) {
        int a=10; //intitializing variable
        int  b=100;

        //block scope
        {
//            int a=100; // cant intitialize again if already done
            a=100; //can modify it and would change its value
            System.out.println(a); //100

            int c=20;// intializing a new variable...it cannot be accessed outside the block
        }
        System.out.println(a); //100
//        System.out.println(c); //error.. cant access c outside of the block
    }
}
