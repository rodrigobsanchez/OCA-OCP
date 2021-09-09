package OCA.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrickyStuffFromChapter3 {

    public static void main(String[] args) {
        char[]c = new char[2];
        //c.capacity(); nao existe.
        int len = c.length;

        ArrayList arrayList = new ArrayList();
        arrayList.size();
       // arrayList.remove(0); //throws runtime exception

        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        //list.add(7); does not compile

        int[] random = {6 , -4, 12, 0, -10};
        int x = 122;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);

        String s = "6";
        System.out.println(Integer.valueOf(s) + "  " + Integer.parseInt(s));

        ArrayList<Integer> arrInt = new ArrayList<>();
        arrInt.add(Integer.valueOf(s));
        arrInt.add(Integer.parseInt(s));
        arrInt.add(7);
        arrInt.add(null);

        for(int temp : arrInt){
            System.out.println(temp);
        }
    }
}
