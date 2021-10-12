package OCA.Chapter1;

public class PrimitiveTypes {
    boolean aBoolean = true; //or false
    byte aByte = 123; // range -128 +127
    short aShort = 123;
    int anInt = 123;
    long aLong = 123;
    float aFloat = 123.23f;
    double aDouble = 123.233;
    char aChar = 'a';
    //String is an object so it can only be a reference to a object String

    /**
     * When a number is present in the code.
     * it called literal and Java assumes it is a int.
     */

    //long max = 3123456789; // DOES NOT COMPILE cuz is bigger than max int value and the number is literal an int.
    long max = 3123456789L;

    public static void main(String[] args) {

        /**
         * Numerics that can be applied to number..
         */
        System.out.println(56);  // 56
        System.out.println(0b11); // 3
        System.out.println(017); // 15
        System.out.println(0x1F); // 31


        /**
         * UnderCore in number for better reading
         *  _1000.00; / WRONG
         *  1000.00_; / WRONG
         *  1000_.00; / WRONG
         *  1_00_0.0_0; / RIGHT!!
         */

        int million = 1000000;
        int million2 = 1_000_000;
        int million3 = 1000_000;

        /*
         *  Cannot assign null to primitive types!!!!
         * */
//        int i = null;
//        double d = null;
//        boolean b = null;

        //Reference type can be assign null tough
        String s = null;
        Double d = null;
        Boolean b = null;
        Integer i = null;



    }



}
