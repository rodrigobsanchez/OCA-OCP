package OCA.Chapter3.Strings;

public class StringUnderStandingEquality {
/*
* Tricky stuff from String boolean comparison
* */
    public static void main(String[] args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one == two); // false
        System.out.println(one == three); // true

        String x = "Hello World";
        String y = "Hello World";
        System.out.println( x == y); // true

        String x2 = "Hello World2";
        String y2 = "  Hello World2".trim();
        System.out.println( x2 == y2); // false
        System.out.println( x2.equals(y2)); // .equals will print true

        String x3 = new String("Hello World");
        String y3 = "Hello World";
        System.out.println( x3 == y3); // false
        System.out.println( x3.equals(y3)); // true

    }
}
