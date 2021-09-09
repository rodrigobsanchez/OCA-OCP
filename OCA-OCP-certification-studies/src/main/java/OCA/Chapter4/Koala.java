package OCA.Chapter4;

public class Koala {
   public static int count;


   public static void main(String[] args) {
        Koala.count = 4;
        Koala k1 = new Koala();
        Koala k2 = new Koala();
        k1.count = 6;
        k2.count = 5;

       System.out.println(Koala.count);
       System.out.println(k1.count);

       // it prints 5 because at end there is only a static varialble count

    }
}
