package OCA.Chapter2;

public class SwitchStatements {
    /*
    * switch(variableToTest) {
    *       case constantExpression1:
    *           code for case1;
    *           break;
    *       case constantExpression2:
    *           code for case1;
    *           break;
    *       default:
    *           code for default;
    *  }
    *
    * constantExpression must be same data type.
    * default can be at order, and it will only execute when any of the other cases match
    *  if there is no 'break' statement the next case will execute whether is matched or not.
    * */

    public static void main(String[] args) {
        /*
        * Java 8 types that are not supported by switched can't use them.
        *   *** long, Long, boolean, Boolean
        * */
        int weekDay = 5;
        switch(weekDay) {
            default:
                System.out.println("Wednesday");
                break;
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
        }

        // prints only Wednesday

        switch(weekDay) {
            default:
                System.out.println("Wednesday");
            case 0:
                System.out.println("Monday");
                break;
            case 5:
                System.out.println("Tuesday");
                break;
        }

        // prints Tuesday

    }
}
