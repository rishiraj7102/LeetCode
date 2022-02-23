package OOP;
// singleton class is a class where only one object can be created for it
public class Singleton {
    private Singleton(){            //making the constructor private so as to block creation of new objects

    }
    private static  Singleton instance;   //creating a single instance of singleton class // only this single obj is allowed

    static Singleton getInstance(){
        if(Singleton.instance==null)        //if the instance has not been created, its value would be null
        {
            instance=new Singleton();      //hence creating the object
        }
        return instance; // returning the same object
    }
}
