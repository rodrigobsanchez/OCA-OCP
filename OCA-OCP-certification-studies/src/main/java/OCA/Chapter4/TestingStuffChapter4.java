package OCA.Chapter4;

public class TestingStuffChapter4 {
    /*
    They only work within a interface??
    default void shit(){

    }
    */

    final void shitFinal(){

    }

    final static void methdo4(){}
    static final void methdo3(){}

    public static void swing(){
        System.out.println("Swing");
    }
    public  void climb(){
        System.out.println("Swing");
    }

    public static void play(){
        swing();
       // climb();
    }


    public static void main(String[] args) {
        TestingStuffChapter4 tt = new TestingStuffChapter4();
        tt.play();
        TestingStuffChapter4 tt2 = new TestingStuffChapter4();
        tt2.play();
    }
}
