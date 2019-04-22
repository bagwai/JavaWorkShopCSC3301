                              /** Class example demostrating a
                              Composition HAS-A Relationship
                              the file name: Car.java**/
class Engine {
  public void start() {}
  public void rev() {}
  public void stop() {}
} // end of the Engine class
class Wheel {
  public void inflate(int psi) {}
} // end of the Wheel class

class Window {
  public void rollup() {}
  public void rolldown() {}
} // end of the Window class

class Door {
  protected Window window = new Window();
  public void open() {}
  public void close() {}
} // end of the Door class

public class Car {
    protected Engine engine = new Engine();
    protected Wheel[] wheel = new Wheel[4];
    protected Door
    left = new Door(), // first door
    right = new Door(); // 2-door
public Car() { // constructor
    for(int i = 0; i < 4; i++)
    wheel[i] = new Wheel();
    } // end of the constructor
public static void main(String[] args) {
    Car car = new Car();
    //System.out.println(car.left.window.rollup());
    //System.out.println(car.wheel[0].inflate(72));
    } // end of the main method
} // end of the Car class
