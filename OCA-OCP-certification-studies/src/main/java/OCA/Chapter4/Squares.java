package OCA.Chapter4;

import java.util.function.Predicate;

public class Squares {
    static String result = "";
    int age;
    public static long square(int x){
        long y = x * (long) x;
        x = -1;
        return y;
    }

    private static void check(Squares square, Predicate<Squares> pred){
        String result = pred.test(square) ? "match" : "not match";
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Koala();
        new TestingStuffChapter4();

        Squares s = new Squares();
        s.age = 1;
        check(s, p -> p.age < 5);


    }
}
