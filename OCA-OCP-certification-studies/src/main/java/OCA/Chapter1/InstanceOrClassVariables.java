package OCA.Chapter1;

/*
* When variables are not local They are called instance or class variables. Also called fields.
*
*  - Class variables are shared in all objects of the given class.
*  - They DO NOT NEED to be initialized. As they are declared they are given a defaul value
* */

public class InstanceOrClassVariables {
    public boolean bol;
    public byte bite;
    public short shorty;
    public int integer;
    public long longer;
    public float lessNum;
    public double num;
    public char charac;
    public String s; // This represent all reference variables. String is a object like Integer or Double.

    public static void main(String[] args) {
        InstanceOrClassVariables a = new InstanceOrClassVariables();

        System.out.println(a.bol); //false
        System.out.println(a.bite); // 0
        System.out.println(a.shorty); // 0
        System.out.println(a.integer); // 0
        System.out.println(a.longer); // 0
        System.out.println(a.lessNum); // 0.0
        System.out.println(a.num); // 0.0
        System.out.println(a.charac); //  '\u0000' (NUL)
        System.out.println(a.s); // null

    }
}
