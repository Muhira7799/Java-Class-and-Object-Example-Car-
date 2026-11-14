class Car {
    // 4 States (Attributes)
    String brand = "Toyota";
    String color = "Red";
    int year = 2024;
    double price = 25000.0;

    // 3 Behaviors (Methods)
    void startEngine() {
        System.out.println("Engine started");
    }

    void accelerate() {
        System.out.println("Car is accelerating");
    }

    void brake() {
        System.out.println("Car has stopped");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println("Brand: " + myCar.brand + ", Color: " + myCar.color);
        myCar.startEngine();
        myCar.accelerate();
        myCar.brake();
    }
}