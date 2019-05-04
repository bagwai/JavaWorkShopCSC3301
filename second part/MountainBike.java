//Java Exercise 
//Demostrating a simple implementation of interfaces
//Mubarak Daha Isa
//CST/16/COM/00582

interface Bicycle {
    // wheel revelution per minutes

    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBreak(int decrement);
}

public class MountainBike implements Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    // since this class is an implements of Bicycle
    // the compiler will now requre all the methods from Bicycle interface
    // it will return compile time error if any of the methods is missing

    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBreak(int decrement) {
        speed -= decrement;
    }

    void printState() {
        System.out.println("Cadence: " + cadence + " Speed: " + speed + " Gear: " + gear);
    }

    public static void main(String[] args) {
        MountainBike bike1 = new MountainBike();
        MountainBike bike2 = new MountainBike();

        bike1.speedUp(67);
        bike1.changeCadence(45);
        bike1.applyBreak(20);
        bike1.printState();

        bike2.speedUp(100);
        bike2.changeCadence(69);
        bike2.applyBreak(10);
        bike2.printState();
    }
}