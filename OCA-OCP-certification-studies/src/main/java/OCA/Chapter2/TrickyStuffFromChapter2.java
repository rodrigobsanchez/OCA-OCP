package OCA.Chapter2;

public class TrickyStuffFromChapter2 {

    public static void main(String[] args) {

        final char a = 'A', d = 'D';
        char grade = 'A';

        switch (grade){
            case a:
                System.out.println("Jupiter");
                break;
            case 'B':
                System.out.println("great");
            case 'C':
                System.out.println("");

        }

        String s = "Hello";
        String t = new String(s);
        if("Hello".equals(s)) System.out.println("It does compile");

        if("Hello" == s)
            System.out.println("Fucking pega Ratao");
        if(s == "Hello")
            System.out.println("Not gonna catch me");

        s += "Hello";
        System.out.println(s);

        String s1 = "1";
        String s2 = s1.concat("2");
        s2 += s2.concat("3");

        System.out.println(s2);

        int ss1 = 1;
        int ss2 = ss1 +1;
        //ss1 + 4;

        String ex = "012345678";
        ex += 'C';
        ex += 2;
        ex += false;
//        System.out.println(ex);
//        System.out.println(ex.substring(7,7));
//        System.out.println(ex.substring(7,5));
//        System.out.println("SOmethin else");

        StringBuilder sb = new StringBuilder("0123466789");
        System.out.println(sb.reverse());
        sb.delete(2,8);
        System.out.println(sb);

//        StringBuilder sb2 = "String cannot be assign here"; //gives compiler error
    }
}
