package OCA.Chapter2;

public class LogicalOperators {
/*
* Logic operator are & | e ^
*
*       - when referenced to numeric data types, they are called bitwise operators.
* */
    public static void main(String[] args) {
        int x = 10;
        int y = 11;
        int z = 12;

        //AND (&) and short-circuit (&&) means it won't avaliate the second statement if first is false.
        boolean test = x < y && y < z;
        System.out.println(test); // true

        // OR (|) or (||). Or is only false if both operands are false.
        boolean test2 = x < y || y == z;
        System.out.println(test2); // true

        // Exclusive (^), is only true if the operands are different.
        boolean test3 = x > y ^ x == z; // both false that's why is TRUE.

        boolean ratao = x >= 6 || (++x <= 7);
        System.out.println(ratao);
        System.out.println(x); // x is still 10 cuz the second operator of ratao is never reached cuz the 1st is true. Example of short-circuit.







    }
}
