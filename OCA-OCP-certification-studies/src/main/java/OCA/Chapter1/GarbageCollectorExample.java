package OCA.Chapter1;

public class GarbageCollectorExample {
    public static void main(String[] args) {
        String one, two;
        one = new String("A");
        two = new String("B");
        // two objects create and on the heap
        one = two; // Object "A" is eligible to Garbage Collector here because there is no reference pointing to it.
        String three = one;
        one = null;

    }

    /*
    *
    * Method finalize() is called only ONCE  or none time. NEVER TWICE.
    *
    * */
}
