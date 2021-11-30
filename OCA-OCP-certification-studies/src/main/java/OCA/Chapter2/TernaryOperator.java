package OCA.Chapter2;

public class TernaryOperator {

    /*
    *  Ternary Operator: booleanExpression ? expression1 : expression2;
    *   booleanExpression = true -> expression1
    *   booleanExpression = false -> expression2
    *
    * */
    public static void main(String[] args) {
        int y = 10;
        int x = y > 5 ? (2 * y) : (3 * y);
        System.out.println(x); // 20

        // Most common in the test is accumulating ternary inside of others
        int x2 = y == 10 ? y < 10 ? 2 * 5 : x % 2 == 0 ? 2 + 100 : 0 : 5 + 5;
        System.out.println(x2); // x = 102...
        int x3 = y != 10 ? y < 10 ? 2 * 5 : x % 2 == 0 ? 2 + 100 : 0 : 5 + 5;
        System.out.println(x3); // x = 10

    }
}
