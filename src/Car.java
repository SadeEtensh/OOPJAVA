public class Car extends Vehicle {
    int numDoors;
    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }
    @Override
    public void startEngine() {
        System.out.println("Starting the car engine");
    }
    public void accelerate() {
        System.out.println("Accelerating...");
    }
}