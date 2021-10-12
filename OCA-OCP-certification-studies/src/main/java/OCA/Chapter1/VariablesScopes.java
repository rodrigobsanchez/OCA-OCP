package OCA.Chapter1;

public class VariablesScopes {

    /*Class Variables.*/
    static int MAX_LENGTH = 5;
    int length;

    public void grow(int inches){
        if (length < MAX_LENGTH){
            int newSize = length + inches;
            length = newSize;
        }
    }

    /*
    Both variables are local variables, only usable within the method.
    */
    public void eat(int bitesOfCheese) {
        int bitesOfBreads = 1;
    }

    public void eatIfHungry(boolean hungry){
        if(hungry){
            int bitesOfCheese = 2;
        }

//        System.out.println(bitesOfCheese); // DOES NOT COMPILE out of SCOPE
    }
}
