package abstract_classes;

public class iPhone extends Phone implements Camera, Bluetooth{
    public iPhone(){

    }
    public final static String OS = "IOS";

    public iPhone(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    @Override
    public void call() {
        System.out.println("iPhone calls");
    }

    @Override
    public void ring() {
        System.out.println("iPhone rings");
    }

    @Override
    public void text() {
        System.out.println("iPhone texts");
    }

    @Override
    public boolean isConvertible() {
        return true;
    }

    @Override
    public void takesPhoto() {
        System.out.println("iPhone takes photo");

    }

    @Override
    public void connectBluetooth() {
        System.out.println("iPhone connects to Bluetooth");
    }
}
