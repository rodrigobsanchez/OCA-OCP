package OCA.Chapter1;

public class DeclareVariables {
    String s1, s2;
    String s3 = "1", s4 = "2";

    /*ATTENTION*/
    int i1, i2, i3 = 3;
    /*Only i3 is initializes and = 3. The others are not yet initialized i1, i2.*/

    boolean b1, b2;
    String s5 = "1", s6;
   // double d1, double d2; //DOES NOT COMPILE double d1, d2 would have been legal.'
     int i4; int i5;
   // int i6; i7;0  //DOES NOT COMPILE

    /*
    * Only works when they share the same type;
    * */
    // int value , String val; //WRONG


}
