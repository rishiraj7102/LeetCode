package Cloning;

public class Human implements Cloneable{
    int age;
    String name;

    public Human(int a, String name) {
        this.age = a;
        this.name = name;
    }

//    public Human(Human h)
//    {
//        this.age=h.age;
//        this.name=h.name;
//    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
