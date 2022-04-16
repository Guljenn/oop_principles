package inheritance;

public class Tester extends Person {
    public Tester(){

    }
    public Tester (String fName, String lName, int age, String gender){
        super(fName, lName, age, gender);
    }
   public void code() {
       System.out.println("Tester codes");
   }
        public void eat(){
            System.out.println("Tester eats");

       }

       public void sleep(){
           System.out.println("Tester sleeps");
       }

       public void walk(){
           System.out.println("Tester walks");
       }

       public void learn(){
           System.out.println("Tester learns");
       }
   }

