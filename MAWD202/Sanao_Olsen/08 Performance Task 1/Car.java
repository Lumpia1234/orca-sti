package car;

public class Car {
    public static final String MAKE = "Toyota";
    public static int numCars = 0;
    
    private String chassisNo;
    private String model;
    
    public Car(String model) {
        numCars++;
        chassisNo = "ch" + numCars;
        this.model = model;
        
        System.out.println("Car manufactured");
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getChassisNo() {
        return chassisNo;
    }
    
    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }
    
    @Override
    public String toString() {
        return "Car Make: " + MAKE + "\nModel: " + model + "\nChassis Number: " + chassisNo;
    }
}