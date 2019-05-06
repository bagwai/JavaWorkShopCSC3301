interface Vehicles {
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void applyBreak(int decrement);

    void speedUp(int increment);

    public int speed = 0;
    public int cadence = 0;
    public int gear = 1;
}

class Bicycle implements Vehicles {

    public int speed = 0;
    public int cadence = 0;
    public int gear = 1;

    @Override
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    @Override
    public void changeGear(int newValue) {
        gear = newValue;
    }

    @Override
    public void applyBreak(int decrement) {
        speed = speed - decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    void printState() {
        System.out.println("Speed: " + speed + " Cadence: " + cadence + " Gear: " + gear);
    }
}

public class CarInterface implements Vehicles {
    public int speed = 0;
    public int cadence = 0;
    public int gear = 1;

    @Override
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    @Override
    public void changeGear(int newValue) {
        gear = newValue;
    }

    @Override
    public void applyBreak(int decrement) {
        speed = speed - decrement;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    void printState() {
        System.out.println("Speed: " + speed + " Cadence: " + cadence + " Gear: " + gear);
    }

    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        System.out.println();
        System.out.println("The Bike 1 Present State: ");
        bike1.speedUp(50);
        bike1.changeCadence(3);
        bike1.applyBreak(20);
        bike1.printState();

        System.out.println();
        System.out.println("The Bike 2 Present State: ");
        bike2.speedUp(100);
        bike2.changeCadence(4);
        bike2.applyBreak(60);
        bike2.printState();

        CarInterface car1 = new CarInterface();
        CarInterface car2 = new CarInterface();

        System.out.println();
        System.out.println("The Car 1 Present State: ");
        car1.speedUp(40);
        car1.changeCadence(6);
        car1.applyBreak(10);
        car1.printState();

        System.out.println();
        System.out.println("The Car 2 Present State: ");
        car2.speedUp(90);
        car2.changeCadence(9);
        car2.applyBreak(10);
        car2.printState();

    }
}