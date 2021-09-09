package OCA.Chapter2;

public class TestingNumberPromotions {

    public static void main(String[] args) {
        byte x = 5;
        byte y = 10;

        //all valid...
        double z = x + y;
        int zInt = x + y;
        long zLong = x + y;

        int x2 = 0;
        while(x2++ > 10) {}

        boolean yy = true, zz = true;
        int jj = 20;
        //yy = (y != 10) ^ (z = false);

        //infine loop;;;
//        for(int i = 0; i < 10;){
//            i = i++;
//            System.out.println("Hello World");
//        }

        byte aa = 40, bb = 50;
        //byte sum = (byte) aa + bb; //doesn't work
        byte sum = (byte) (aa + bb); // works;

        int yey = 5 * 4 % 3;
        System.out.println(yey);
    }
}
