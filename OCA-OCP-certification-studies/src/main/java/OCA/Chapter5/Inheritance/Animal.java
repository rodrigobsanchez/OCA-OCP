package OCA.Chapter5.Inheritance;

public abstract class Animal {
    private int age;
    private String name;
    public String ibheritableVariable = "I'm a Animal";

    public Animal(){
        this.ibheritableVariable = "I'm the Animal";
    }

    public Animal(int age, String name){
        this.age = age;
        this.name = name;
    }
    public Animal (int age){
        this.age = age;
        this.name = null;
    }

    public void testingMethod(int temp){
        System.out.println("Yey" + temp + " times...");
    }

    public void testingMethod23(int temp){
        System.out.println("Yey" + temp + " times...");
    }

    public void inheritancePARENTHidingVariables(){
        System.out.println(ibheritableVariable);
    }

    public abstract String getSomething (String name);

    public void setAge(int age){
        this.age = age;
    }
}
