class Bicycle {
  int cadence = 0; // attributes
  int speed = 0;
  int gear = 1;

  Bicycle() {
    cadence = 0;
    speed = 0;
    gear = 1;
  } // methods

  void changeCadence(int newValue) {
    cadence = newValue;
  }

  void changeGear(int newValue) {
    gear = newValue;
  }

  void speedUp(int increment) {
    speed = speed + increment;
  }

  void applyBrakes(int decrement) {
    speed = speed - decrement;
  }

  void printStates() {
    System.out.println("Cadence: " + cadence + "Speed: " + speed + "Gear: " + gear);
  }
}

class BicycleDemo{
  public static void main(String[] args) {
    //creating 2 diffrent Bicycle objects

    Bicycle bike1 = new Bicycle();
    Bicycle bike2 = new Bicycle();

    bike1.speedUp(10);
    bike1.printStates();

    bike2.changeCadence(50);
    bike2.speedUp(15);
    bike2.printStates();
  }
}
