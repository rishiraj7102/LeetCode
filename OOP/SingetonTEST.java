package OOP;

public class SingetonTEST {
    public static void main(String[] args) {
        Singleton obj =Singleton.getInstance();   //asking for getting an instance


        Singleton obj2 =Singleton.getInstance();

        Singleton obj3 =Singleton.getInstance();

        //no matter  how many ref variables you create here..only single obj of Singleton would be referred to all of them
        //ie the instance variable we created in the singleton class
        //all 3 ref variables are pointing to one object
    }
}
