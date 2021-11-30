package OCA.Chapter2;

public class CompoundAssignmentOperators {
    public static void main(String[] args) {

        int x = 2, z = 3;
        x = x * z; // --> Simple assignment operator
        x *= z; // --> Compound assignment operator

        // Attention

        long x2 = 10;
        int y = 5;
        //y = y * x2; It wont compile becaise the result of (*) it will be a Long value and y is Int
        // with Compound operator it compiles
        y += x2;

        // Attention

        // weird shit
        long l = 5;
        long l2 = (l=2);
        System.out.println(l2); // 2
        // weird shit

    }
}
