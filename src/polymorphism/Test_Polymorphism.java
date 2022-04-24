package polymorphism;

public class Test_Polymorphism {
    public static void main(String[] args) {
        System.out.println("\n----------Testing Animal object-----------");

        Animal a1 = new Animal();
        a1.eat();
        a1.sleep();



        System.out.println("\n----------Testing Dog object---------");

        Dog d1 = new Dog();
        d1.eat();
        d1.sleep();
        d1.bark();

        System.out.println("\n----------Dog Object in the Shape of Animal---------");

        Animal a2 = new Dog();
        a2.sleep();
        a2.eat();
        a2.eat("food");


    }
}
