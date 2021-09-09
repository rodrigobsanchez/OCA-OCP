package OCA.Chapter6;

public class ErrorsTesting {

    public static void main(String[] args) throws Exception {
        eatCarrot();
    }

    //or

//    public static void main(String[] args) {
//        try {
//            eatCarrot();
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//    }

    private static void eatCarrot() throws Exception{
        System.out.println("shit");
    }
}
