package abstract_classes;

public interface Bluetooth {
    void connectBluetooth();


    static int getYear() {
        return 2022;
    }
    // Default method that has a non-static method with a body
    default boolean isConnected(){
        return true;
    }
}