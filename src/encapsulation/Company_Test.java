package encapsulation;

public class Company_Test {

    public static void main(String[] args) {

        Company company1 = new Company();
        Company company2 = new Company();

        company1.setName("Apple");
        company1.setAddress("California");
        company1.setPhoneNumber("(123) 312-2345");

        company2.setName("Google");
        company2.setAddress("California");
        company2.setPhoneNumber("(000) 055-5555");

        System.out.println("Company1 is = \"" + company1.getName() + "\" and Company2 is = \"" + company2.getName() + "\"");




    }
}
