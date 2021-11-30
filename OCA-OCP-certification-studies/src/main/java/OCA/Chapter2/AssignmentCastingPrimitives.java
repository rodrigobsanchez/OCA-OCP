package OCA.Chapter2;

public class AssignmentCastingPrimitives {

    /*
    *  (=) - Assigning operator.
    * */
    public static void main(String[] args) {
        int x  = 1;

        // int x2 = 1.0; DOES NOT COMPILE
        int x2 = (int) 1.0;

        // short x3 = 123123123; DOES NOT COMPILE
        short x3 = (short) 123123123; // Stored Max short value --> 20678
        // Above is a CASE OF OVERFLOW number.

        // int x4 = 9f; DOES NOT COMPILE
        int x4 = (int) 9f;

        //        long t = 123123123123123123; need L when number is bigger than Integer
        // happen when the number is literal (123...L is not literal) and is bigger than Integer Range.
        long t = 123123123123123L;

        // Case o UNDERFLOW
        // 2147483647 max Integer value if adding +1 it will result in the min integer value a negative number
        System.out.println(2147483647+1);

    }
}
