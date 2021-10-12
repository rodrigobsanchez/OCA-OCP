package OCA.Chapter1;

public class DefaultInitializationOfVariables {

    /*
    * Before you can use a variable, it needs a value.
    *  - Some types get this value automatically. Others requeires manual initialization.
    *  - Compiler won't allow use of uninitialized value.
    *
    * */

    public int notValid(){
        int y = 10;
        int x;
        //int reply = x + y; //DOES NOT COMPILE x was not initialized.
        //return reply;
        return y;
    }

    public int Valid(){
        int y = 10;
        int x;
        x = 2;
        int reply = x + y; //DOES NOT COMPILE x was not initialized.
        return reply;
    }

    public void findAnswer(boolean check){
        int answer;
        int onlyOneBranch;
        if(check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        //System.out.println(onlyOneBranch); // DOES NOT COMPILE cuz if check is false onlyOneBranch is not initialized.
    }
}
