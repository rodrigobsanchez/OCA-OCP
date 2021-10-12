package OCA.Chapter2;

public class ArithmeticOperators {
    /*
    * (+) addition
    * (-) subtraction
    * (*) multiplication
    * (/) division
    * (%) modulus -> 10 % 3 = 1
    *
    *
    * (*,/,%) have a higher order of precedence than ( +, - ) operators.
    * */

    public static void main(String[] args) {
        System.out.println(10 % 3); // 1
        System.out.println(9 % 3); // 0
        System.out.println(9 / 3); // 3

        int x = 2 * 5 + 3 * 4 - 8;
         // x = 10 + 12 - 8
        System.out.println(x); // 14
        int x2 = (2 * 5 + 3) * 4 - 8;
        //x2 = 13 * 4 - 8
        System.out.println(x2); // 44
    }
}
