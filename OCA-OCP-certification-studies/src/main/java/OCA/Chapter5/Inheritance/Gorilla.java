package OCA.Chapter5.Inheritance;

public class Gorilla extends Animal implements AnimalInterface{

    public String ibheritableVariable = "I'm the son";
    public int ageTest = 10;

    public Gorilla(int age){
        super(age,"Gorilla");
    }

    public Gorilla(){
        super();
        super.setAge(10);
        super.ibheritableVariable = "I'm the Animal";
        this.ibheritableVariable = "I'm the son";
    }

    public void testingMethod(int temp){
        System.out.println(temp);
    }

    @Override
    public String getSomething(String name) {
        return null;
    }

    public void inheritanceHidingVariables(){
        System.out.println(ibheritableVariable + " and " + super.ibheritableVariable);
    }

    public boolean booleanTest(){
        System.out.println(true);
        return true;
    }

    @Override
    public int getHeight() {
        return 27;
    }

    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        gorilla.inheritanceHidingVariables();
        gorilla.inheritancePARENTHidingVariables();
        System.out.println();

        System.out.println(gorilla.iCanHaveABody("are you there?"));

        Animal a = new Gorilla(); //Polymorphism trough inheritance
        //a.testAge; doesn't work because only Gorilla have this varaible.
        Animal a2 =  gorilla;
        a.testingMethod(1); // works beacause exist in Animal class
        //a.ageTest; doesn't work cuz is Reference type (Animal) doesn't have variable age.
        Gorilla g = (Gorilla) a2;
        System.out.println(g.ageTest);// it wokrks.... with proper casting
        AnimalInterface animalInterface = new Gorilla(); // interface example
        animalInterface.iCanHaveABody("234234243");



    }


}
