//Java Lab Exercise 1
//Problem Two
//CarDemo.java
//Author: Mubarak Daha Isa CST/16/COM/00582

class Car {
  int horsePower = 20; // attributes
  int speed = 120;
  int fuelConsumption = 3; // All the value of the attributes are assumed
  int gasTank = 10;
  int travelledTime = 3;

  Car() { // constructor
    horsePower = 20;
    speed = 120;
    fuelConsumption = 3;
    gasTank = 10;
    travelledTime = 3;
  }

  // methods
  void travelledTimeUp(int newValue) {
    travelledTime = (speed / travelledTime);
    travelledTime += newValue;
  }

  void speedUp(int increment) {
    speed = speed + increment;
  }

  void applyBrakes(int decrement) {
    speed = speed - decrement;
  }

  void printStatesTank() {
    System.out.println("The State of Tank is: " + (travelledTime - gasTank));
  }
}

// main class
public class CarDemo {
  public static void main(String[] args) {
    // creating 3 diffrent Car objects
    Car car1 = new Car();
    Car car2 = new Car();
    Car car3 = new Car();

    car1.speedUp(20);
    car1.travelledTimeUp(5);
    car1.printStatesTank();

    car2.speedUp(80);
    car2.travelledTimeUp(35);
    car2.printStatesTank();

    car3.speedUp(60);
    car3.travelledTimeUp(32);
    car3.printStatesTank();
  }
}
