package OCA.Chapter2;


/*
*  (+) - Indicates a number is positive. numbers are assumed to be positive only if they
* have a minus before them.
*  (-) - Indicates a literal number is negative or Negates an expression!!
*  (++) - Increments by 1. if before the number it will execute first.
*  (--) - Decrements by 1.
*  (!) - Inverts a Boolean logical value
*
* */
public class UnaryOperators {
    public static void main(String[] args) {
        boolean x = false;
        System.out.println(x);
        x = !x;
        System.out.println(x); // true

        double d = 1.21;
        d = -d;
        System.out.println(d); // -1.21
        d = -d;
        System.out.println(d); // 1.21

//        !d // DOES NOT COMPILE d is a double
//        -x // DOES NOT COMPILE x is a boolean
    }
}
