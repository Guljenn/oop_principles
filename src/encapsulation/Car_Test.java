package encapsulation;

public class Car_Test {
    public static void main(String[] args) {
        Car car1 = new Car();

        //Setting info for make
        car1.make = "BMW";

        //Getting info ofm make
        System.out.println((car1.make));

        //Setting info for year

        car1.setYear(2020);

        // Getting info for year
        System.out.println(car1.getYear());

           // car1.setPrice(5000, "Hello World"); // exception

            car1.setPrice(5000, "abcd1234");
        System.out.println(car1.getPrice());


    }
}
