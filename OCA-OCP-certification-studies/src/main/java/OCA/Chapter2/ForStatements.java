package OCA.Chapter2;

public class ForStatements {
    /*
    * for(initialization; booleanExpression; updateStatement){
    *   //Body
    * }
    * for( int i = 0; i < 10; i++){}
    * */

    /*
    * For-Each-Statement.
    *
    * for(dataType instance : collection) {
    *    // Body
    * }
    * */

    /*
    *  Nested Loops is loops inside other loops.
    * */

    /*
    * break; this statement transfers the flow of control out to the enclosing statement. It will end the loop earlier.
    * */


    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.print(i + " ");
        }

        System.out.println();
        int x = 0;
        // adding multiple Terms to it.
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++){
            System.out.print(y + " ");
        }

        System.out.println();

        String[] names = new String[3];
        names[0] = "Josnei";
        names[1] = "JJ";
        names[2] = "NN";
        for(String temp : names){
            System.out.print(temp + " ");
        }

        System.out.println();

        //Nested example
        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        for(int[] temp : myComplexArray){
            for(int i = 0; i < temp.length; i++){
                System.out.print(temp[i] + "\t");
            }
            System.out.println();
        }

        PARENT_LOOP: for(int i = 0; i < 10; i++){
            for(int z = 10; z > 0; z--){
                System.out.println("Yahoo");
                break PARENT_LOOP;
            }
        }

        PARENT_LOOP: for(int i = 0; i < 10; i++){
           NODE_LOOP:  for(int z = 10; z > 0; z--){
                System.out.println("Yahoo Node");
                break NODE_LOOP;
            }
            System.out.println("Yahoo Parent");
            break PARENT_LOOP;
        }

    }
}
