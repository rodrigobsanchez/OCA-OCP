package OCA.Chapter2;

public class JavaOperatorsBasic {

    public static void main(String[] args) {

        int y = 4;
        double x = 3 + 2 * --y;  // *** Decrement occurs FIRST before even multiply operator
        /*

         -- y is Pre-unary-operator...
        * 1st y is decremented
        *  -- x = 3 + 2 * 3 ( y -1 = 3)
        *     x = 3 + 6
        *     x = 9.0
        * */
        System.out.println(x); // 9.0
    }
}
