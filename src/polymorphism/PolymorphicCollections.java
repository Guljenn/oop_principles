package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PolymorphicCollections {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Dog d1 = new Dog();


        System.out.println("---------------Cat Object----------------");

        c1.eat();
        c1.sleep();
        c1.eat("fish");

        System.out.println("----------------Dog Object----------------");
        d1.eat();
        d1.sleep();
        d1.eat("meat");


        System.out.println("--------------Animal Object----------------");
        Animal a1 = new Animal();
        a1.eat();
        a1.sleep();
        a1.eat("some food");

        System.out.println("------------cat and dog ojects in animal shape----------");

        Animal a2 = new Cat();
        a2.eat();
        a2.sleep();
        Animal a3 = new Dog();
        a3.eat();
        a3.sleep();

        Animal[] animals = {a1, a2, c1, d1, a2};

        for(Object a : animals)
            System.out.println(a.getClass().getSimpleName());



        ArrayList<Animal> animalList = new ArrayList<>(Arrays.asList(animals));

        for(Animal anm : animalList)
            anm.eat();

//        System.out.println("\n-----Dog and Cat Object in Animal ArrayList------\n");
//// ONE WAY TO ADD TO ARRAYLIST
//        ArrayList<Animal> creatures1 = new ArrayList<>();
//        creatures1.add(cat1);
//        creatures1.add(dog1);
//        creatures1.add(animal1);
//        creatures1.add(cat2);
//        creatures1.add(dog2);
//
//// SECOND WAY TO ADD TO ARRAYLIST
//        ArrayList<Animal> creatures2 = new ArrayList<>(Arrays.asList(animals));
//
//// THIRD WAY TO ADD TO ARRAYLIST
//        ArrayList<Animal> creatures3 = new ArrayList<>();
//        Collections.addAll(creatures3, animals); // 1st arg: collection to be added to, 2nd arg: from which collection info is taken from
//
//// FOURTH WAY TO ADD TO ARRAYLIST
//        ArrayList<Animal> creatures4 = new ArrayList<>();
//        for (Animal element : animals){
//            creatures4.add(element);
//
//
//
//
//
//




    }
}
