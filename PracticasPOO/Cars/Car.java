public class Car {

    // Attributes
    private String brand;
    private String reference;
    private int model;
    private String color;
    private int cc;
    private String carPlate;
    private int price;

    // Constructor Method
    public Car(String brand, String reference, int model, String color, int cc, String carPlate, int price) {
        this.brand = brand;
        this.reference = reference;
        this.model = model;
        this.color = color;
        this.cc = cc;
        this.carPlate = carPlate;
        this.price = price;
    }

    // Methods
    public void showDataCar() {
        System.out.println("------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Reference: " + reference);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("CC: " + cc);
        System.out.println("Plate: " + carPlate);
        System.out.println("Price: $" + price);
        System.out.println("                ");
    }

    public void startEngine() {
        System.out.println("Starting engine...");
        System.out.println("Brooom");
        System.out.println("¡Engine On!");
    }
}
