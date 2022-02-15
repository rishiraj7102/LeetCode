package assignments;

public class Pangram {
    public static void main(String[] args) {
        String sentence="thequickbrownfoxjumpsovertheazydog";
        String characters="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<characters.length();i++)
        {
            if(sentence.indexOf(characters.charAt(i))==-1)
            {
                System.out.println("not a pangram");
                return;
            }
        }
        System.out.println("pangram");

    }
}
