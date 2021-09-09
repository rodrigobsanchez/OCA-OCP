package OCA.Chapter5.Inheritance;

public interface AnimalInterface {

   int getHeight(); //public word is optional

    // can have a body
    default String iCanHaveABody(String name){
        return "Yes, " + name +". Thats my body!!";
    }
}
