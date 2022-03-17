package Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human rish=new Human(20,"rishabh");
        // Human twin=new Human(rish);  // the new keyword takes a lot of time to create a new object
        // by using method of cloning we can increase the speed of this process

        Human twin=(Human) rish.clone();
        System.out.println(twin.age+" "+twin.name);
    }
}
