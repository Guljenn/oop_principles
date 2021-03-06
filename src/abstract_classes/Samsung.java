package abstract_classes;

public class Samsung extends Phone implements Camera, Bluetooth {
    public Samsung (){

    }
    public static final String OS = "Android";

    public Samsung(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    @Override
    public void call() {
        System.out.println("Samsung calls");
    }

    @Override
    public void ring() {
        System.out.println("Samsung rings");
    }

    @Override
    public void text() {
        System.out.println("Samsung texts");
    }

    @Override
    public boolean isConvertible() {
        return true;
    }

    @Override
    public void takesPhoto() {
        System.out.println("Samsung takes photo");
    }

    @Override
    public void connectBluetooth() {
        System.out.println("Samsung connects to Bluetooth");
    }
}
