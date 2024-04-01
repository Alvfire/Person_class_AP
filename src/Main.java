// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Student s1 = new Student();
       Student s2 = new Student("Alvaro","Pelaez");
       System.out.println(s2.toString());

       Admin a1 = new Admin();
       Admin a2 = new Admin("Jane", "Doe");
       System.out.println(a2.toString());

       Faculty f1 = new Faculty();
       Faculty f2 = new Faculty("John","Doe");
        System.out.println(f2.toString());
    }
}