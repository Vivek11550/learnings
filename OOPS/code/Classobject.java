// Define the Car class
class Car {
    // Attributes (also called properties or data members)
    String color;
    String brand;

    // Method (behavior)
    void drive() {
        System.out.println("The " + color + " " + brand + " is driving.");
    }
}

// Main class to run the program
public class Classobject {
    public static void main(String[] args) {
        // Creating first object (instance) of Car

        
        Car car1 = new Car();
        car1.color = "Red";
        car1.brand = "Toyota";
        car1.drive(); // Output: The Red Toyota is driving.

        // Creating second object (instance) of Car
        Car car2 = new Car();
        car2.color = "Blue";
        car2.brand = "Honda";
        car2.drive(); // Output: The Blue Honda is driving.
    }
}
