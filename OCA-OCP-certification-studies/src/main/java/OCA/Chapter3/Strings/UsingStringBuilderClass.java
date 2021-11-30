package OCA.Chapter3.Strings;

public class UsingStringBuilderClass {
/*
*
* Important Methods:
* StringBuilder sb = new StringBuilder();
* sb.charAt(), sb.indexOf(), sb.length(), sb.substring() exact the same as normal strings.
*
* -- sb.append() - the most frequent used. receives a str as parameter and appends to the existing string inside the string builder.
* -- sb.insert() - add chars to string at determined index as parameter.
* -- sb.delete() - opposite of insert method
* -- sb.reverse() - exactly what the name implies.
* -- sb.toString() - converts the builder into normal String.
* * */
    public static void main(String[] args) {

        StringBuilder alpha = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++){ // interesting...
            System.out.print(current);
            alpha.append(current);
        }
        System.out.println();
        System.out.println(alpha);

        // 3 ways to create;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10); // 10 supposed to be the size o string.

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);


        // sb.append
        StringBuilder sb = new StringBuilder().append(1).append('c');
        sb.append("JOSNEI");
        sb.append(true);
        System.out.println(sb); // 1cJOSNEItrue


        //sb1.insert
        StringBuilder sbInsert = new StringBuilder("animals");
        sb.insert(7, "-"); // sb = animals-
        sb.insert(0, "-"); // sb = -animals-
        sb.insert(4, "-"); // sb = -ani-mals-

        //sb.delete
        StringBuilder sbDelete = new StringBuilder("abcdef");
        sb.delete(1, 3); // sb = adef

        //sb.deleteCharAt
        StringBuilder sb5 = new StringBuilder("abcdef");
        sb5.deleteCharAt(0); // sb = bcdef

        //sb.reverse()
        StringBuilder sb6 = new StringBuilder("12345");
        sb6.reverse();
        System.out.println(sb6);

    }
}
