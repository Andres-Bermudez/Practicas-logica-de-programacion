/*
 * @Author Andres Bermudez
 * Java Developer
*/
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Hyundai", "Tucson", 2020, "Black", 2000, "JNO453", 85000000);
        car1.showDataCar();

        Car car2 = new Car("Toyota", "Prado TXL", 2015, "White", 2500, "HNU874", 185000000);
        car2.showDataCar();
        car2.startEngine();

        Car car3 = new Car("Chevrolet", "Tracker", 2018, "Blue", 1800, "EMO876", 68000000);
        car3.showDataCar();
    }
}