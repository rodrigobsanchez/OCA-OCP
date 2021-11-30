package OCA.Chapter2;

public class NumericPromotion {

    /*
    * Primitive Numeric Promotion: when applying operators to primitives they change type.
        * Set of Rules
        *  1 - If two values have different data types, Java will promote one of the values to the larger of the two data types.
        *  2 - If one value is Integer and other is Floating (double or float), Java will promote integer to floating point.
        *  3 - Smaller data types (byte, short, char) are FIRST PROMOTED DO INTEGER...
        *  4 - The resulting value will match the promoted operands
    * */

    public static void main(String[] args) {

        int x = 1;
        long y = 33;
        Object z = x * y; // It will be Long
        System.out.println(z.getClass()); // class java.lang.Long

        double x2 = 39.21;
//        float y2 = 2.1 without the f at the end wont compile
        float y2 = 2.1f;
        Object z2 = x2 * y2; // It will be Double
        System.out.println(z2.getClass()); // class java.lang.Double

        short x3 = 1;
        short y3 = 33;
        Object z3 = x3 * y3; // It will be Int
        System.out.println(z3.getClass()); // class java.lang.Integer

        short x4 = 14;
        float y4 = 33;
        double j = 30;
        Object z4 = x4 * y4 / j; // It will be double
        System.out.println(z4.getClass()); // class java.lang.Double

        /*
        * Apparently Wrapper class works the same...
        * */
        Short i5 = 6;
        Short d5 = 6;
        Object z5 = i5 + d5;
        System.out.println(z5.getClass());


        short s1 = 10;
        short s2 = 3;
//        short s3 = s2 * s1; DOES NOT COMPILE because short is promoted to Integer
        short s3 = (short) (s2 * s1); // OK
    }

}
