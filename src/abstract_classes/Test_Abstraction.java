package abstract_classes;

import java.util.ArrayList;

public class Test_Abstraction {
    public static void main(String[] args) {
        Samsung s1 = new Samsung("Samsung", "Black", 64, 700);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        iPhone i1 = new iPhone("Apple", "Silver", 128, 1000);


        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(s1);
        phones.add(n1);
        phones.add(i1);



        phones.forEach(element -> System.out.println(element));
        int max = Integer.MIN_VALUE;
        Phone mostExpensivePhone = null;
        int count = 0;
        for(Phone element: phones) {
            if (element.isConvertible()) count++;
            if (element.price > max) mostExpensivePhone = element;
        }

        System.out.println(count);
        System.out.println("The most expensive phone is: " + mostExpensivePhone.getClass().getSimpleName());
    }
}