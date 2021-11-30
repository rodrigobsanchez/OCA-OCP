package OCA.Chapter3.Arrays;


/*
* Example of it are Strings. They are array os chars.
* */
public class UnderStandingArrays {

    public static void main(String[] args) {
        //common way
        int[] numbers1 = new int[3]; // type int size 3
        int[] numbers2 = {42, 55 ,99};
        int[] numbers3 = new int[] {42, 55 ,99};

        //other ways
        int[] numAnimals;
        int [] numAnimals2;
        int numAnimals3[];
        int numAnimals4 [];
        int[] ids, type;


        String [] bugs = { "cricket", "beetle", "ladybug"};
        String [] alias = bugs;
        System.out.println(bugs.equals(alias)); // prints TRUE!!


        /*
        * Using Arrays
        * */

        String [] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length);
        System.out.println(mammals[0]);
        System.out.println(mammals[1]);
        System.out.println(mammals[2]);

        String[] birds = new String[6];
        System.out.println(birds.toString()); // print 6; All elements are null totaling 5 of them
        System.out.println(birds.length); // print 6;


        int[] numbers = new int[10]; // all elements are 0; 0 is default value for primitive integers type
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 5;
            System.out.println(numbers[i]);
        }
    }
}
