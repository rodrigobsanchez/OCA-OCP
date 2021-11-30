package OCA.Chapter2;

import java.io.File;

public class EqualityOperators {

    /*
    * Equals Operator '=='
    * Not Equals operator '!='
    * */
    public static void main(String[] args) {
        // Numeric primitive types, different type, the values are automatically promoted. Case below left side is promoted to double.
        boolean test = 5 == 5.0; // true
        System.out.println(true == true);

        /*
        * Can also compare two objects, including null and String values.
        * */

        //Tricky stuff
        boolean y = false;
        boolean x = (y = true);
        System.out.println(x); // true

        File f1 = new File("abb.txt");
        File f2 = new File("a22b.txt");
        File f3 = f1;
        System.out.println(f1 == f2); // false;
        System.out.println(f1 == f3);// true;


    }
}
