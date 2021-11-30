package OCA.Chapter2;

public class WhileLoopDoWhileLoop {

    /*
    * while(booleanExp) {
    *       // code here
    * }
    *
    *
    * do {
    *     code here
    * } while(booleanExp);
    *
    * The difference here is that the do-while the code block is guaranteed to execute at least once.
    *
    *  */

    public static void main(String[] args) {
        int x = 10;

        // no yahoo's here.
        while(x < 9){
            System.out.println("Yahoo");
        }

        // do while will show yahoo once.
        do{
            System.out.println("Yahoo");

        }while (x < 9);

    }
}
