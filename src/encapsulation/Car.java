package encapsulation;

public class Car {
    //instance variables

    public String make;
    private int year;
    private double price;
    private boolean isConvertible = true; // this info will always be true

        // Providing indirect access to year to set and get info
    // set methods are always void
    public void setYear (int year){

        this.year = year;
    }

    // get methods are always return types

    public int getYear (){
        return year;
    }
    // require password with parameters
    public void setPrice (double price, String adminPassword){
        if(adminPassword.equals("abcd1234")) this.price = price;
        else throw new RuntimeException("The password entered is not valid");
    }

    public double getPrice(){
        return price;
    }

}
