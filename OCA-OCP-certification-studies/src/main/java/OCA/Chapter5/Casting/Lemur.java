package OCA.Chapter5.Casting;

public class Lemur extends Primate{
    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        Primate primate = lemur;
        int a = lemur.age;
       // int b = primate.age; doen't work...
        System.out.println(a);

        String test = "test";
       // Integer integer = (Integer) test; doesnt compile

        int xx = 10;


        Primate primate1 = new Primate();
        Lemur primate11 = (Lemur) primate1;
        System.out.println(primate11.age);

        // Lemur lemur1 = primate; doesn't work....
        Lemur lemur2 = (Lemur) primate;
        System.out.println(lemur2.age); // have access because of the casting.


//        Primate primate2 = new Primate();
//        Lemur lemur3 = (Lemur) primate2; // It does compile BUT... launches CAST EXCEPTION

    }
}
