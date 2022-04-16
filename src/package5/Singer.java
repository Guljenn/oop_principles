package package5;

import inheritance.Dancer;
import inheritance.Person;

public class Singer extends Person {

    public Singer(){

    }
    public Singer(String fName, String lName, int age, String gender) {
        super(fName, lName, age, gender);
    }
        public void sing(){
            System.out.println("Singer sings");
        }


    public static void main(String[] args) {
        Singer singer1 = new Singer();

        singer1.learn();

        Dancer dancer = new Dancer();

    }

}
