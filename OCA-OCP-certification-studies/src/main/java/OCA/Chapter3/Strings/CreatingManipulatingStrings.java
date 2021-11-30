package OCA.Chapter3.Strings;

/*
*  1 + 2 numeric is 3
* "1" + "2" = "12"
* */

/*
* 1. if both operands are numeric, + means numeric additions
* 2. if either operando is a String, +means concatenation.
* 3. The expression is evaluated left to right.
* */

/*
* Immutability --> once a String object is created, it is not allows to change. Like a storage box.
* */

public class CreatingManipulatingStrings {
    public static void main(String[] args) {
        System.out.println(1 + 2); //3
        System.out.println("a" + "b"); // ab
        System.out.println("a" + "b" + 3); // ab3
        System.out.println(1 + 2 + "c"); // 3c

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); // 64


        //Example of Immutability
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3"); // --> this will not change the string s2 because is not concatenating to the reference s2;
        System.out.println(s2); // print 12
        s2 = s2.concat("3"); // this will change it.
        System.out.println(s2); // print 123

    }


}
