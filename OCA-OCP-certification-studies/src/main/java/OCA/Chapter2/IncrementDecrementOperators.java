package OCA.Chapter2;


/*
*  They have a higher order or precedence as compared to binary operators.
* they often get applied first.
* */
public class IncrementDecrementOperators {
    public static void main(String[] args) {
       // **********************************************
        int x = 3;
        int y = ++x * 5 / x-- + --x; // 1st x is 4, 2nd is 4 and 3rd is 3 again
        //int y = 4 * 5 / x-- + --x;
        //int y = 4 * 5 / 4 + --x;
        //int y = 4 * 5 / 4 + 2;
        System.out.println("x = " + x); // 2
        System.out.println("y = " + y); // 7

        int x2 = 3;
        int y2 = ++x2 * x2++ / --x2 + x2++ - 2 * ++x2;
        // y2 = 4 * 4 / 4 + 4 - 2 * 6
        System.out.println("y2 = " + y2); //-4

        int x3 = 15;
        int y3 = 12 + --x3 - x3++ * ( ++x3 - --x3 * 2);
        // y3 = 12 + 14 - 14 * ( 16 - 15 / 2 );
        // y3 = 12 + 14 - 14 * 8.5;
        System.out.println("y3 = " + y3); // -222?

        int x4 = 15;
        int y4 = 12 + --x4 - x4++ * ( ++x4 - --x4 / 2);
        // y3 = 12 + 14 - 14 * ( 16 - 15 / 2 );
        // y3 = 12 + 14 - 14 * 9;
        // y3 = 12 + 14 - 14 * ( 16 - 15 / 2)
        System.out.println("y4 = " + y4); // -100 pq o 8.5 eh arredondado para 9.

        int counter = 0;
        System.out.println(counter); // 0
        System.out.println(++counter); // 1
        System.out.println(counter++); // 1
        System.out.println(--counter); // 1
        System.out.println(counter--); // 0
    }
}
